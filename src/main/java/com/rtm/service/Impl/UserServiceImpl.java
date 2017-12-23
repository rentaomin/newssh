package com.rtm.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Service;
import com.rtm.entity.User;
import com.rtm.service.UserService;

@Service(value="userService")
public class UserServiceImpl implements UserService{

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Override
	public void saveUser(User user) {
		hibernateTemplate.save(user);
		System.out.println("保存成功");
	}	

}
