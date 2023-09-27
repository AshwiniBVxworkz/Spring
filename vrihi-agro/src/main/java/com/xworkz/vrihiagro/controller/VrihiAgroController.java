package com.xworkz.vrihiagro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.vrihiagro.dto.VrihiAgroDto;
import com.xworkz.vrihiagro.service.VrihiAgroService;

@Component
@RequestMapping("/")
public class VrihiAgroController {
	public VrihiAgroController() {
		System.out.println("Inside VrihiAgroController");
	}
@Autowired
	VrihiAgroService service;
	@PostMapping("/save")
	public String onSave(@ModelAttribute VrihiAgroDto dto,Model model) {
		System.out.println("onSave method is invoked");
		model.addAttribute("Dto",dto);
		System.out.println("Dto : "+dto);
		service.save(dto);
		return "success.jsp";
		
		
	}
	
	
}
