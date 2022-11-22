package com.ezen.springboard.service;

import java.util.List;
import java.util.Map;

import com.ezen.springboard.vo.NameVO;

public interface HomeService {
	void insertName(NameVO nameVO);
	
	List<NameVO> getNameList();
	
	// 변수명은 안맞춰도 됌.
	NameVO getName(int nameNo);
	
	void deleteName(int nameNo);
	
//	4-1. update
//	void updateName(NameVO nameVO);
	
	void updateName(Map<String, Object> paramMap);
}
