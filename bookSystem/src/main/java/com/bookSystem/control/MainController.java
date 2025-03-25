package com.bookSystem.control;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.bookSystem.DTO.MemberDTO;

@Controller
public class MainController {

	@GetMapping("/test")
	public String main(Model model) {
		model.addAttribute("name","곽찬양");
		model.addAttribute("age",30);
		model.addAttribute("tel","010-2343-9874");
		model.addAttribute("address","남아프리카 공화국");
		
		
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setAge(29);
		memberDTO.setId("rim");
		memberDTO.setName("김은나");
		memberDTO.setTel("010-8888-0000");
		
		model.addAttribute("user",memberDTO);
		
		List<String> animal = new ArrayList<>();
		animal.add("개");	animal.add("호랑이");
		animal.add("뱀");	animal.add("닭");
		animal.add("토끼");	animal.add("소");
		
		model.addAttribute("animal",animal);
		
		return "test";
	}
	
	
	
	
	
	
}

