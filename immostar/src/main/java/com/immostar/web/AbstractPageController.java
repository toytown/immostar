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
package com.immostar.web;

import java.io.UnsupportedEncodingException;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.util.UriUtils;
import org.springframework.web.util.WebUtils;

import com.immostar.domain.RealState;
import com.immostar.service.impl.RealStateImageService;
import com.immostar.service.interfaces.RealStateService;

/**
 * 
 * @author Yuan Ji
 *
 */
public class AbstractPageController {


	@Autowired
    protected RealStateService<RealState> realStateService;
	
	@Autowired
	protected RealStateImageService imageService;
	
    
    protected String encodeUrlPathSegment(String pathSegment, HttpServletRequest httpServletRequest) {
        String enc = httpServletRequest.getCharacterEncoding();
        if (enc == null) {
            enc = WebUtils.DEFAULT_CHARACTER_ENCODING;
        }
        try {
            pathSegment = UriUtils.encodePathSegment(pathSegment, enc);
        } catch (UnsupportedEncodingException uee) {
        }
        return pathSegment;
    }

    String getUserIpAddress(HttpServletRequest request) {
        return request.getHeader("x-forwarded-for");
    }

}
