package com.springStudy1.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
//	private int id;
	private String userId;
	private String userPw;
	private String userEmail;
	private String userJob;
	private String userAddr;
	private String userLike;
	public boolean findByUserId(String userId2) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
