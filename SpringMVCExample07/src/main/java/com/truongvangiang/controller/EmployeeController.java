package com.truongvangiang.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.truongvangiang.bean.Employee;

@Controller
public class EmployeeController {
	@RequestMapping("/hello")
	public String display(Model m) {
		Employee em = new Employee();
		m.addAttribute("emp", em);
		return "viewpage";
	}
	@RequestMapping("/helloagain")
	public String submitForm( @Valid @ModelAttribute("emp") Employee em , BindingResult br) {
			if(br.hasErrors()) {
				return "viewpage";
			}else {
				
				return "confirmation-page";
			}
			
			
		}
	

}
