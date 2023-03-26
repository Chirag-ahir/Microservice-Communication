package com.miit.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.miit.user.entity.User;

@Service
public class UserServiceImpl implements UserService{
	
	//fake user list
	List<User> list = List.of(
			new User(101L,"Chirag Ahir","6478529467"),
			new User(102L,"Parth Patel","6478529467"),
			new User(103L,"Chirag Ahir","8549625789"),
			new User(104L,"Monika Patel","6478529467"),
			new User(105L, "Ankit Tiwari", "99999"),
            new User(106L, "Ravi Tiwari", "888")
	);

	@Override
	public User getUser(Long id) {
        return list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);

	}

}
