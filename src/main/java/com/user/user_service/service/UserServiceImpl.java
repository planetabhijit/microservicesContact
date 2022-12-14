package com.user.user_service.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.user.user_service.entity.User;

@Service
public class UserServiceImpl implements UserService {

	List<User> list = new ArrayList<>();
	
	public UserServiceImpl(){
	list.add(new User(111L, "Abhijit1", "9768400000"));
	list.add(new User(222L, "Abhijit2", "9768400000"));
	list.add(new User(333L, "Abhijit3", "9768400000"));
	}
	
	@Override
	public User getUser(Long id) {
		
		return this.list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
	}
}
