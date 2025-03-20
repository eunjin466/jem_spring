package com.springStudy1.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainControl {
//
//	@GetMapping("/signIn")
//		public String signInPage() {
//		System.out.println("너 로그인하래");
//		return "signIn.html";
//	}
	
	@GetMapping("/signIn")
	public String login() {
		return "singin.html";
	}
	@GetMapping("/")
	public String homePage() {
		return "index.html";
	}
	@GetMapping("/List")
	public ModelAndView listPage(@RequestParam String type){
		System.out.println(type);
		ModelAndView mav = new ModelAndView("list.html");
//		mav.setViewName("");
		
		return mav;
	}
	
	
	
	
//	@GetMapping("/test") //localhost/test
//	public String testPage() {
//		System.out.println("와 쩐당 이게 되노 ..");
//		return "hello.html";
//	}
	
	
	
	
} 

// 주소 : http://localhost/signIn
// 뷰 페이지 : signIn.html
//		내용 : 아이디, 비밀번호 입력가능 하게




/*
 * 컨트롤 클래스의 역할지정 - @Controller를 클래스 위에 넣기
 * 클라이언트의 요청처리
 * 	-GET 방식으로 주소 요청 들어온다면 @GetMapping
 * 	-POST 방식으로 주소 요청이 들어온다면 @PostMapping
 *  @GetMapping("주소")
 * 	 	=> @GetMapping("/list") -> localhost/list 주소요청시 동작
 * 	public String boardSave(){
 * 
 * }
 * 	-> localhost/save 주소가 post방식으로 요청되는 경우 boardSave 메서드 실행
 * 
 * 
 */




