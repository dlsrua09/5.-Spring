package com.ezen.springboard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ezen.springboard.service.board.BoardService;

@Controller
@RequestMapping("/board")
public class boardController {
	@Autowired
	// 멤버변수 생성
	// service에 있는 메소드를 호출
	// 주소변경, 클릭, 엔터 요청 시 -> controller에 requestMapping안에 메소드를 추가하고 실행시키게 해줌
	// 컨트롤러에서는 boardService 메소드를 호출하는 역할이 큼
	private BoardService boardService;
	
	/*
	 클라이언트가 이벤트를 발생시키면 요청이 발생되고
	 컨트롤러에서 @RequestMapping으로 매핑된 매핑주소와 요청주소가 같으면
	 해당 메소드를 실행한다.
	 해당 메소드안에서는 DB접근이 필요할 때는 Service의 메소드를 호출하여
	 ServiceImpl -> DAO -> Mapper까지 실행한다.
	 DB접근이 필요없는 경우는 해당 메소드에서 바로 jsp(화면단)을 리턴한다.
	 화면에서 요청발생 -> Controller -> Service -> ServiceImpl -> DAO -> Mapper    
	 항상 요런 구성은 아니지만 보통 이렇다(위에구성)  
	 DB에서 가져올 데이터가 있을 경우 위 순서의 역순으로 진행
	 */
	@GetMapping("/getBoardList.do")
	public String getBoardListView() {
		return "board/getBoardList";
	}
	
	// 게시글 목록 가져오는 로직처리
	
	
	
	
	
	
	@GetMapping("/insertBoard.do")
	public String insertBoardView() {
		return "/board/insertBoard";
	}
}
