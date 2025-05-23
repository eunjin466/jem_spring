package com.springStudy1.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springStudy1.DAO.SchoolDAO;
import com.springStudy1.DTO.School;

@Service
public class SchoolService {
	
	private final SchoolDAO schoolDao;
	
	@Autowired // 자동주입 - SchoolService 객체가 생성되면 SchoolDAO객체생성하여 주입
	public SchoolService(SchoolDAO schoolDao) {
		this.schoolDao = schoolDao; // 약한결합
	}
	
	public List<School> typeSelect(String type){
		return schoolDao.findAllByType(type);
		// 이 메서드의 역할은 controller클래스가 유치원, 초등학교, 중학교 등의 요청이 들어올경우 
		// service클래스는 controller 클래스의 클라이언트 요청 처리를 실행하기 위한 클래스
		// DAO와 controller 사이에서 전달자의 역할을 하기도 한다.
		// controller에서 직접 DAO를 호출하는 방식을 쓰기도 하지만 service를 통해 받는걸 권장
	}
	
}
