package com.app.set;

import javax.inject.Inject;

//mybatis 라입
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/*.xml"})
public class mybatisTest {

	@Inject
	private SqlSessionFactory sqlFactory;
	
	@Test
	public void testFactory() {
	
		System.out.println("good factory");
		System.out.println(sqlFactory);
		System.out.println("good factory1");
	}
	
	
	@Test
	public void testSession() throws Exception{
		
		try {
			System.out.println("good session");
			SqlSession session = sqlFactory.openSession();
			System.out.println(session);
			System.out.println("good session1");
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("no");
		}
		
	}
	
}
