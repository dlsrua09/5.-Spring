package com.ezen.springboard.service.impl;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ezen.springboard.vo.NameVO;

@Repository
public class HomeDAO {
	@Autowired
	private SqlSessionTemplate mybatis;
	
	public void insertName(NameVO nameVO) {
		// mapper 쿼리문 호출  namespace.아이디(쿼리명)
		mybatis.insert("HomeDAO.insertName", nameVO);
	}
	
	public List<NameVO> getNameList() {
		return mybatis.selectList("HomeDAO.getNameList");
	}
	
	public NameVO getName(int nameNo) {
		return mybatis.selectOne("HomeDAO.getName", nameNo);
	}
	
	public void deleteName(int nameNo) {
		// namespace(값).메소드명, 매개변수
		// 파라미터가 두개 이상 필요할 때는
		// Map이나 VO담은 후에 쿼리로 전달
		mybatis.delete("HomeDAO.deleteName", nameNo);
	}
	
//	4-1. update
//	public void updateName(NameVO nameVO) {
//		mybatis.update("HomeDAO.updateName", nameVO);
//	}
	
	public void updateName(Map<String, Object> paramMap) {
		mybatis.update("HomeDAO.updateName", paramMap);
	}
}
