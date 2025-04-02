package com.talk.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.talk.DTO.BoardDetailDto;
import com.talk.DTO.BoardDto;
import com.talk.DTO.BoardListDto;
import com.talk.Entity.BoardEntity;
import com.talk.Reporitory.BoardRepository;
import com.talk.Reporitory.CommentRepository;

@Service

public class BoardService {
	@Autowired
	private BoardRepository boardRepository;
	
	@Autowired
	private CommentRepository commentRepository;
	
	//게시글 저장
	public void boardSave(BoardDto boardDto) {
		 
	}
	//게시글 삭제
	public void boardDelete(int id) {
		
	}
	// 게시글 수정
	public void boardUpdate(BoardDto boardDto)
	{
		
	}
	//게시글 상세보기
	public BoardDetailDto boardDetailDto(int id) {
		return null;
	}
	//게시글 목록
	public List<BoardListDto> boardList(int pageNum){
		return null;
	}
	//게시글 전체갯수
	public int boardCount() {
		return 0;
	}
	// 최근글
	public List<BoardListDto> boardRecent(){
		List<BoardEntity> boardEntities = boardRepository.findByOrderByWriteDateDesc();
		List<BoardListDto> boardListDtos = new ArrayList<>();
		for(BoardEntity board : boardEntities) {
			BoardListDto dto = BoardListDto.from(board);
			boardListDtos.add(dto);
		}
		return boardListDtos;
	}
	// 인기글
	public List<BoardListDto> boardPopular(){
		
		List<BoardEntity> boardEntities = boardRepository.findByOrderByHitDesc();
		List<BoardListDto> boardListDtos = new ArrayList<>();
		for(BoardEntity board : boardEntities) {
			BoardListDto dto = BoardListDto.from(board);
			boardListDtos.add(dto);
		}
		return boardListDtos;
		
	}
}
