package com.app.set.dao;


import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.app.set.domain.sampleVO;

@Repository
public class sampleDAO implements sampleDAOImpl{

	@Inject
	private SqlSession sqlSession;
	
	private static final String NAMESPACE = "com.app.set.mapper.number";
	
	
	@Override
	public void create(sampleVO vo) throws Exception{
		
		sqlSession.insert(NAMESPACE+".create", vo);
		
	}
	
	@Override
	public sampleVO allList() throws Exception{
		
		sampleVO vo = null;
		
		return vo;
					
	}
	
	@Override
	public sampleVO whereList(String name) throws Exception{
		
		return sqlSession.selectOne(NAMESPACE+".whereList", name);
				
	}
	
	@Override
	public sampleVO ascList() throws Exception{
	
		return sqlSession.selectOne(NAMESPACE+".whereList");
	}
	
	@Override
	public sampleVO descList() throws Exception{
	
		return sqlSession.selectOne(NAMESPACE+".whereList");
	}
	
	@Override
	public void update(sampleVO vo) throws Exception{
	
		sqlSession.update(NAMESPACE+".update", vo);
	}
	
	@Override
	public void delete(String name) throws Exception{
	
		sqlSession.delete(NAMESPACE+".delete", name);
		
	}
	
	
	
	
}
