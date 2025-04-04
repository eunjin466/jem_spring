package com.talk.Reporitory;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.talk.Entity.CommentEntity;

@Mapper
public interface CommentRepository {
	
	// 댓긋 저장 메서드
	public int insert(CommentEntity commentEntity);
	
	//댓글 삭제 메서드
	public int delete (int id);
	
	// 댓글 상세보기 목록 가져오기 
	public List<CommentEntity> findByBoardIdOrderByDesc(int id); 
}
