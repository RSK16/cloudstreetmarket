package edu.zipcloud.cloudstreetmarket.portal.controllers;

import org.apache.commons.logging.Log;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

@Controller
@RequestMapping(value="/test")
public class DefaultController {
	private static Logger log = Logger.getLogger(DefaultController.class);
	
	@RequestMapping(value="/first",method=RequestMethod.GET)
	public ModelAndView fallback(){
		log.info("----------");
		System.out.println("111");
		ModelAndView mv = new ModelAndView();
		mv.addObject("aa", "123");
		mv.setViewName("index");
		return mv;
	}
	
	
	@RequestMapping(value="/first1",method=RequestMethod.GET)
	public String fallback1(){
		log.info("----------");
		System.out.println("22222");
		return "index";
	}
}
