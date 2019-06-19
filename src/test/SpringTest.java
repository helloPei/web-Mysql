package test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.demo.dao.UserDao;
import com.demo.entity.User;

public class SpringTest extends SpringTestBase {
	
	@Autowired
	private UserDao userDao;
	
	@Test
	public void selectTest() {
		User user = userDao.findAllById(3);
		System.out.println(user.getUsername());
	}
	
	@Test
	public void selectCountTest() {
		int count = userDao.selectCount();
		System.out.println(count);
	}
}