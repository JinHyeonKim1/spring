package com.app.set;

import java.sql.Connection;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.ContextConfiguration;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/*.xml"})
public class DataSourceTest {
	
	
	@Inject
	private DataSource ds;
	
	
	@Test
	public void testConnection() throws Exception{
	
		try {
			Connection con = ds.getConnection();
			System.out.println(con);
			System.out.println("good");
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("No");
			
			
		}
		
	}
	
	
}
