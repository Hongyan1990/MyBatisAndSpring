package cn.com.sm.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.com.sm.dao.UserDao;
import cn.com.sm.po.User;

public class UserserviceTest {
	private ApplicationContext applicationContext;
	@Before
	public void step() throws Exception {
		applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
	}
	
	@Test
	public void testFindUserById() {
		UserDao userDao = (UserDao)applicationContext.getBean("userDao");
		try {
			User user = userDao.findUserById(6);
			System.out.println("uname=" + user.getUname());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
