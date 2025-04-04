package com.talk.Control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.talk.DTO.MemberSignInDto;
import com.talk.DTO.MemberSignUpDto;
import com.talk.Service.BoardService;
import com.talk.Service.MemberService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
@RequestMapping("/member")
public class MemberController {
	@Autowired
	private MemberService memberService;
	@Autowired
	private BoardService boardService;
	
	// 회원가입 요청
	@PostMapping("/signUp")
	public String signUp(@Valid MemberSignUpDto memberSignUpDto, BindingResult bindinResult ,Model model) {
		if(bindinResult.hasErrors()) {
			System.out.println("유효하지 않은 값이 입력되었습니다");
			
			//최근글 5개 가져오기
			model.addAttribute("recentList",boardService.boardRecent());
			//인기글 5개 가져오기
			model.addAttribute("popularList",boardService.boardPopular());
			
			model.addAttribute("memberSignInDto", new MemberSignInDto());
			model.addAttribute("open", 1);
			
			
			return "index";
		}
		// 회원가입을 위해 입력한 값들이 올바른 값이라며 여기서부터 동작 위에 if는 올바르지 않은 경우
		memberService.memberSave(memberSignUpDto);
		
		
		return "redirect:/";
	}
	// 로그인 요청
	@PostMapping("/signIn")
	public String signIn(@Valid MemberSignInDto memberSignInDto, BindingResult bindingResult, HttpSession session,Model model) {
		
		boolean hasError =bindingResult.hasErrors(); 
		if( !hasError) { 
			hasError = memberService.memberLogin(memberSignInDto); //true면 틀렸다
			if( hasError ) {
				bindingResult.reject("fail", "아이디또는 비밀번호를 잘못 입력했습니다.");
			}
		}
		if( hasError ) { // 로그인 아이디 또는 비밀번호 입력안하거나 길이가 맞지 않거나 양어 숫자 아닌경우
			//최근글 5개 가져오기
			model.addAttribute("recentList",boardService.boardRecent());
			//인기글 5개 가져오기
			model.addAttribute("popularList",boardService.boardPopular());
			
			model.addAttribute("memberSignUpDto", new MemberSignUpDto());
			model.addAttribute("show", 1);
			return "index";
		}
		
		// 여기서부터 실행되는 코드는 아이디 비밀번호가 잘 입력되어서 로그인 성공이다.
		session.setAttribute("user", memberSignInDto.getMemberId());
		
		
		
		
		
		return "redirect:/";
	}
}
