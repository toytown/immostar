package com.immostar.web.site;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.immostar.web.AbstractPublicPageController;

@Controller
public class GoogleMapController extends AbstractPublicPageController {

	@RequestMapping(value = "/map")
	public ModelAndView getGoogleMap() {
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("lat", 103.786612);
		mv.addObject("lon", 1.438543);
		mv.setViewName("listing/googleMap");
		return mv;
	} 
}
