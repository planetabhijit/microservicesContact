package com.user.user_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.user.user_service.entity.Contact;
import com.user.user_service.entity.User;
import com.user.user_service.service.UserService;

@RestController
@RequestMapping(value="/user")
public class UserController {

	@Autowired
	UserService userService;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@SuppressWarnings("unchecked")
	@GetMapping("/{userId}")
	public User getUser(@PathVariable("userId") Long userId) {
		//http://localhost:8081/contact/user/111
		
		User user = this.userService.getUser(userId);
		List contacts = this.restTemplate.getForObject("http://CONTACT-SERVICE/contact/user/"+user.getUserId(), List.class);
		
		user.setContacts(contacts);
		return user;
	}
	
}
