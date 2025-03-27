package com.bookSystem.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookListDto {
	private int bookId; // 검색뎔과 출력하고 대출선택을 위해
	private String bookTitle;
	private String bookAuthor;
	private String bookPublishing;
	

	
	
}
