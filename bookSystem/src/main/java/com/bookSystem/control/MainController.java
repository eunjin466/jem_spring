package com.bookSystem.control;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bookSystem.DTO.MemberDTO;
import com.bookSystem.Service.BookService;
import com.bookSystem.Service.MemberService;

@Controller
public class MainController {
	
	@Autowired
	private MemberService memberService;
	
	@Autowired
	private BookService bookService;
	
	
	
	@GetMapping("/")
	public String home(Model model) {
		MemberDTO memberDto	= new MemberDTO();
		model.addAttribute("memberDTO", memberDto);
		return "index";
	}
	
	@PostMapping("/signIn")
	public String login( MemberDTO memberDTO, Model model) {
		System.out.println( memberDTO.getEmail());
		
		// 로그인처리를 진행하려면 service의 메서드를 호출한다.
		// member와 관련 된것은 Memberservice에서 처리한다.
		// 컨트롤 쪽에서는 로그인처리과정이 어떻게 진행되고 하는지 전혀 몰라도 된다.
		// 그냥 Service쪽 메서드를 호출하면 된다.
		boolean isSuccess = memberService.signIn( memberDTO );
		
		if(isSuccess) {
			return "redirect:/";
		}
		// 로그인 실패시 index.html 다시 돌아가기
		model.addAttribute("fail",1);
		return "index";
		
		
	}


	
	
	
//	@GetMapping("/test")
//	public String main(Model model) {
//		model.addAttribute("name","곽찬양");
//		model.addAttribute("age",30);
//		model.addAttribute("tel","010-2343-9874");
//		model.addAttribute("address","남아프리카 공화국");
//		
//		
//		MemberDTO memberDTO = new MemberDTO();
//		memberDTO.setAge(29);
//		memberDTO.setId("rim");
//		memberDTO.setName("김은나");
//		memberDTO.setTel("010-8888-0000");
//		
//		model.addAttribute("user",memberDTO);
//		
//		List<String> animal = new ArrayList<>();
//		animal.add("개");	animal.add("호랑이");
//		animal.add("뱀");	animal.add("닭");
//		animal.add("토끼");	animal.add("소");
//		
//		model.addAttribute("animal",animal);
//		
//		return "test";
//	}
//	
//	@GetMapping("/test2")
//	public String test() {
//		return "test2";
//	}
	
	
	
	
}

