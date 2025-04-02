package com.talk.Control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.talk.DTO.MemberSignUpDto;
import com.talk.Service.MemberService;

@Controller
@RequestMapping("/member")
public class MemberController {
	@Autowired
	private MemberService memberService;
	
	// 회원가입 요청
	@PostMapping("/signUp")
	public String signUp(MemberSignUpDto memberSignUpDto, Model model) {
		return null;
	}
	// 로그인 요청
	@PostMapping("/member/signIn")
	public String signIn(MemberSignUpDto memberSignUpDto, Model model) {
		return null;
	}
}
