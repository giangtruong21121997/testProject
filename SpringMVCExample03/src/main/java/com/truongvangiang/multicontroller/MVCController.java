package com.truongvangiang.multicontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;

@Controller
public class MVCController {
	@RequestMapping("/mvc")
	public ModelAndView showMVC(@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
		System.out.println("hien thi");
		ModelAndView mv = new ModelAndView("view_mvc");
		return mv;
	}

	@RequestMapping("/boot")
	public ModelAndView showMVC1(@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
		ModelAndView mv = new ModelAndView("view_boot");
		return mv;
	}

}
