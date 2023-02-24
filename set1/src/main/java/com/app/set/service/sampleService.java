package com.app.set.service;



import javax.inject.Inject;

import org.springframework.stereotype.Service;


import com.app.set.dao.sampleDAOImpl;
import com.app.set.domain.sampleVO;

@Service
public class sampleService implements sampleServiceImpl {

	
	@Inject
	private sampleDAOImpl sampleDAO;
	
	@Override
	public void create(sampleVO vo) throws Exception{
	
		sampleDAO.create(vo);
	}
	
	@Override
	public sampleVO allList() throws Exception{
	
		return sampleDAO.allList();
		
	}
	
	@Override
	public sampleVO whereList(String name) throws Exception{
	
		return sampleDAO.whereList(name);
		
	}
	
	@Override
	public sampleVO ascList() throws Exception{
	
		return sampleDAO.ascList();
		
	}
	
	@Override
	public sampleVO descList() throws Exception{
	
		return sampleDAO.descList();		
	}
	
	@Override
	public void update(sampleVO vo) throws Exception{
		
		sampleDAO.update(vo);
	}
	
	
	@Override
	public void delete(String name) throws Exception{
	
		sampleDAO.delete(name);
		
	}
	
}
