package com.ezen.spring.service;

import java.util.List;

import com.ezen.spring.vo.BoardVO;

// 컨트롤 쉬프트 o ( 자동생성 ) 
public interface BoardService {
	// CRUD(Create Read Update Delete) 기능의 메소드 구현(CRUD만 잘해도 칭찬받음)
	// 글 등록
	void insertBoard(BoardVO boardVO);
	
	// 글 수정
	void updateBoard(BoardVO boardVO);
	
	// 글 삭제
	void deleteBoard(BoardVO boardVO);
	
	// 글 상세 조회, 1개도 출력할 수 있으니께 BoardVO
	BoardVO getBoard(BoardVO boardVO);
	
	// 글 목록 조회, 개수를 조회할거니까(List)
	List<BoardVO> getBoardList();
}
