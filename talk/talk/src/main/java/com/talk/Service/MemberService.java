package com.talk.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.talk.Reporitory.MemberRepository;

@Service
public class MemberService {
	@Autowired
	private MemberRepository memberRepository;
}
