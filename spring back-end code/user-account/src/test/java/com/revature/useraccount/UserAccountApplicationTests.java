package com.revature.useraccount;

import com.revature.useraccount.entity.User;
import com.revature.useraccount.repo.UserRepo;
import com.revature.useraccount.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class UserAccountApplicationTests {

	@Autowired
	private UserService provider;

	@Autowired
	private UserRepo repo;

	@Test
	public void signUpUserTest(){
		User user = User.builder()
				.emailAddress("user1@gamer.net")
				.username("user1")
				.password("user1")
				.build();
		provider.signUpUser(user);
	}

	@Test
	public void fetchUsersTest(){
		List<User> users = provider.fetchUsers();
		System.out.println(users);
	}
}