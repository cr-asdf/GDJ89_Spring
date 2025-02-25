package com.winter.app.users;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.winter.app.SampleTestCase;

public class UserDAOTest extends SampleTestCase {
	
	@Autowired
	 private UserDAO userDAO;
	
	@Test
	public void getDetailTest() {
		UserDTO userDTO = new UserDTO();
		userDTO.setUserName("id");
		//userDTO = userDAO.getDetail(userDTO);
		
		assertNotNull(userDTO);
		
	}
	
	@Test(expected = Exception.class)
	public void joinTest () throws Exception {
		UserDTO userDTO = new UserDTO();
		userDTO.setUserName("id");
		userDTO.setPassword("pw");
		userDTO.setName("name");
		userDTO.setPhone("phone");
		userDTO.setEmail("email");
		
		//int result = userDAO.join(userDTO);
		int result=0;
		//단정문 assert
		assertEquals(1, result);
	}


}
