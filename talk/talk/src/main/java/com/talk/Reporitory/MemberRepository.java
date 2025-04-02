package com.talk.Reporitory;

import org.apache.ibatis.annotations.Mapper;

import com.talk.Entity.MemberEntity;

@Mapper
public interface MemberRepository {
	// 회원가입 정보 테이블에 저장하는 메서드
	public int insert(MemberEntity memberEntity);
	
	// 로그인을 위한 쿼리 동작 메서드
	public boolean findBymemberIdAndPassword(MemberEntity memberEntity);
}
