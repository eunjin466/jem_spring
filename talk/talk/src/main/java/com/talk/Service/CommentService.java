package com.talk.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.talk.Reporitory.CommentRepository;

@Service
public class CommentService {
	@Autowired
	private CommentRepository commemntRepository;
}
