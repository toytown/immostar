/* 
 * Copyright 2013 JIWHIZ Consulting Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.immostar.web.site;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.IOUtils;
import org.bson.types.ObjectId;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.immostar.domain.RealState;
import com.immostar.domain.SearchRequest;
import com.immostar.utils.PageWrapper;
import com.immostar.web.AbstractPublicPageController;

/**
 * Controller for home page, about page, profile page, etc.
 * 
 * @author Yuan Ji
 *
 */
@Controller
public class HomeController extends AbstractPublicPageController {
    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    public HomeController() {
    }

    /**
     * Simply selects the home view to render by returning its name.
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Model uiModel, HttpServletRequest request) {
      
    	return "site/home";
    }


    /**
     * Simply selects the home view to render by returning its name.
     */
    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public String search(@ModelAttribute("searchRequest") SearchRequest searchRequest, @RequestParam(required=false) String pn, Model uiModel) {

    	PageRequest pageReq = new PageRequest(Integer.valueOf(pn != null ? pn : "1") -1, 5);
    	Page<RealState> results = realStateService.findBySearchRequest(searchRequest, pageReq);
    	PageWrapper<RealState> page = new PageWrapper<RealState>(results, "/search");
    	
    	for (RealState realState : results) {
			System.out.println(realState);
		}
    	uiModel.addAttribute("page", page);
    	return "listing/properties-list";
    }
    
    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public String handleFormUpload(
        @RequestParam("file") MultipartFile file) {

        if (!file.isEmpty()) {
        	RealState rs = realStateService.findOne(new ObjectId("50405F32036461988227FDA7"));
            try {
				imageService.saveUploadedImageFileInDB(file.getName(), file.getInputStream(), rs, false);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
           return "redirect:uploadSuccess";
       } else {
           return "redirect:uploadFailure";
       }
    }
    
    /**
     * Simply selects the home view to render by returning its name.
     */
    @RequestMapping(value = "/image/{id}", method = RequestMethod.GET)
    public ResponseEntity<byte[]> loadImage(@PathVariable("id") String id) {
    	
    		InputStream in = imageService.getImageAsBytes(id);
    		HttpHeaders headers = new HttpHeaders();
    		headers.setContentType(MediaType.IMAGE_JPEG);
    		try {
				return new ResponseEntity<byte[]>(IOUtils.toByteArray(in), headers, HttpStatus.CREATED);
			} catch (IOException e) {
				throw new RuntimeException("Error reading image from database");
			}
    		
    	
    }
    
    @RequestMapping(value = "/about", method = RequestMethod.GET)
    public String about(Model uiModel, HttpServletRequest request) {
     
        return "site/about";
    }

    @RequestMapping(value = "/profile/{userId}", method = RequestMethod.GET)
    public String profile(@PathVariable("userId") String userId, Model uiModel, HttpServletRequest request) {
     
        
        return "site/userProfile";
    }

    @RequestMapping(value="/signin", method=RequestMethod.GET)
    public String signin(Model uiModel) {
        return "site/signin";
    }
    
    /**
     * Handle exceptions.
     */
    @RequestMapping(value = "/uncaughtException", method = RequestMethod.GET)
    public String uncaughtException(Model uiModel) {
        return "site/uncaughtException";
    }

    @RequestMapping(value = "/resourceNotFound", method = RequestMethod.GET)
    public String resourceNotFound(Model uiModel) {
        return "site/resourceNotFound";
    }

}
