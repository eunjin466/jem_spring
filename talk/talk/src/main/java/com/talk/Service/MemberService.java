package com.talk.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.talk.DTO.MemberSignInDto;
import com.talk.DTO.MemberSignUpDto;
import com.talk.Entity.MemberEntity;
import com.talk.Reporitory.MemberRepository;

@Service
public class MemberService {
	@Autowired
	private MemberRepository memberRepository;
	
	// 회원가입
	public void memberSave(MemberSignUpDto memberSignUpDto) {
		MemberEntity memberEntity = MemberEntity.from(memberSignUpDto);
		memberRepository.insert(memberEntity);
		
	}
	// 로그인
	public boolean memberLogin (MemberSignInDto memberSignInDto) {
		MemberEntity memberEntity = MemberSignInDto.to(memberSignInDto);
		return !memberRepository.findBymemberIdAndPassword(memberEntity);
		
//		return false; // 아이디 비밀번호를 잘 입력 했다!
	}

}

