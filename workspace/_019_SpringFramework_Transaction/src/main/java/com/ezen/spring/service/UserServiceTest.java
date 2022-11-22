package com.ezen.spring.service;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.ezen.spring.vo.UserVO;

public class UserServiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 스프링 컨테이너 구동
		AbstractApplicationContext applicationContext =
				new GenericXmlApplicationContext("root-context.xml");
		
		// 2. UserServiceImpl 객체를 Lookup
		UserService userService =
				(UserService)applicationContext.getBean("userService");
		
		// 3. 회원 등록 테스트
//		UserVO userVO = new UserVO();
//		userVO.setId("test");
//		userVO.setPassword("12345");
//		userVO.setName("테스트");
//		
//		userService.join(userVO);
		
		// 4. 회원 조회 테스트
		// Id를 세팅하기위한 UserVO 객체
		UserVO userVO = new UserVO();
		userVO.setId("admin");
		
		
		UserVO userInfo = userService.getUser(userVO);
		System.out.println(userInfo.toString());
		
		// 5. 스프링 컨테이너 종료
		applicationContext.close();
	}

}
