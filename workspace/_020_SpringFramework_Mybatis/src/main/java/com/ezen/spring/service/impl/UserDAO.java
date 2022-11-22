package com.ezen.spring.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.stereotype.Repository;

import com.ezen.spring.common.JDBCUtil;
import com.ezen.spring.vo.UserVO;

@Repository
public class UserDAO {
	// JDBC 관련 변수
	private Connection conn = null;
	private PreparedStatement stmt = null;
	private ResultSet rs = null;
	
	// SQL 쿼리
	private final String USER_JOIN = "INSERT INTO USER VALUES(?, ?, ?, 'USER')";
	private final String GET_USER = "SELECT * FROM USER WHERE ID = ?";
	
	// CRUD 기능 구현
	public void join(UserVO userVO) {
		System.out.println("JDBC로 join 기능구현");
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(USER_JOIN);
			stmt.setString(1, userVO.getId());
			stmt.setString(2, userVO.getPassword());
			stmt.setString(3, userVO.getName());
			
			stmt.executeUpdate();
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			JDBCUtil.close(stmt, conn);
		}
	}
	
	// 아이디 상세 구현
	public UserVO getUser(UserVO userVO) {
		System.out.println("JDBC로 getUser 기능구현");
		// 조회해온 ResultSet에 담을 UserVO 객체 선언
		UserVO user = new UserVO();
		try {
			conn = JDBCUtil.getConnection();
			
			stmt = conn.prepareStatement(GET_USER);
			
			stmt.setString(1, userVO.getId());
	
			rs = stmt.executeQuery();
			if ( rs.next()) {
				user.setId(rs.getString("ID"));
				user.setPassword(rs.getString("PASSWORD"));
				user.setName(rs.getString("NAME"));
				user.setRole(rs.getString("ROLE"));;
			}
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			JDBCUtil.close(rs, stmt, conn);
		}
		return user;
	}
	
}
