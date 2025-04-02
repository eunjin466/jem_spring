package com.talk.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.talk.DTO.MemberSignInDto;
import com.talk.DTO.MemberSignUpDto;
import com.talk.Reporitory.MemberRepository;

@Service
public class MemberService {
	@Autowired
	private MemberRepository memberRepository;
	
	public void memberSave(MemberSignUpDto memberSignUpDto) {
		
	}
	public boolean memberLogin (MemberSignInDto memberSignInDto) {
		return false;
	}

}

