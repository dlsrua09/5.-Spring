package com.ezen.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ezen.spring.common.LogAdvice;
import com.ezen.spring.service.BoardService;
import com.ezen.spring.vo.BoardVO;

// ServiceImpl: 비즈니스 로직을 구현하는 클래스
// 예를 들면, 공과금 납부할때 할인을 계산
// 스마트폰의 시리얼 번호 자동 생성...
// 비즈니스 로직 처리가 완료된 데이터를 DB에 넣기 위해서 DAO 객체를 의존성 주입하여 사용
@Service("boardService")
public class BoardServiceImpl implements BoardService {
	// 의존성 주입할 DAO 객체
	@Autowired
	BoardDAO boardDAO;

	
	// 기본 게시판이라 따로 처리해야줘야될 비즈니스 로직이 없어서,
	// 바로 DAO의 메소드를 호출하여 DB조작
	@Override
	public void insertBoard(BoardVO boardVO) {
		// 임의로 예외 발생
		
//		if(boardVO.getBoardNo() == 0) {
//			throw new IllegalArgumentException("0번 글은 등록할 수 없습니다.");
//		}
		
		
		boardDAO.insertBoard(boardVO);
		boardDAO.insertBoard(boardVO); // rollback
	}
	
	@Override
	public void updateBoard(BoardVO boardVO) {
		boardDAO.updateBoard(boardVO);
	}
	
	@Override
	public void deleteBoard(BoardVO boardVO) {
		boardDAO.deleteBoard(boardVO);
	}
	
	// 에러는 리턴값이 있는데 리턴값을 안적어서 에러남.
	@Override
	public BoardVO getBoard(BoardVO boardVO) {
		return boardDAO.getBoard(boardVO);
	}
	
	
	@Override
	public List<BoardVO> getBoardList() {
		return boardDAO.getBoardList();
	}
}