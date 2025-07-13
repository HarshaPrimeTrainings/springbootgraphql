package com.training.springbootgraphql.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.training.springbootgraphql.dto.UserInput;
import com.training.springbootgraphql.entity.User;
import com.training.springbootgraphql.repository.UserRepository;

@Controller
public class UserGrapQLController {

	@Autowired
	UserRepository repository;
	
	@QueryMapping
	public List<User> getusers(){
		return repository.findAll();
	}
	
	@QueryMapping
	public User getUser(@Argument Integer uid) {
		return repository.findById(uid).orElseThrow(()->new RuntimeException("User Not found with id "+ uid));
	}
	
	@MutationMapping
	public User saveuser(@Argument UserInput userinput) {
		User user = new User(userinput.getUsername(),userinput.getContact(),userinput.getOrders());
		return repository.save(user);
	}
	
	@MutationMapping
	public String deleteuser(@Argument Integer uid) {
		repository.deleteById(uid);
		return "User Dleted";
	}
	
	
}
