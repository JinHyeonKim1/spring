package com.app.set.service;

import com.app.set.domain.sampleVO;

public interface sampleServiceImpl {

	
	public void create(sampleVO vo) throws Exception;
	
	public sampleVO allList() throws Exception;
	
	public sampleVO whereList(String name) throws Exception;
	
	public sampleVO ascList() throws Exception;
	
	public sampleVO descList() throws Exception;
	
	public void update(sampleVO vo) throws Exception;
	
	public void delete(String name) throws Exception;
	
	//메서드 이름을 공통적으로 사용
}
