package com.training.springbootgraphql.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.springbootgraphql.entity.User;
import com.training.springbootgraphql.repository.UserRepository;

@RequestMapping("/user")
@RestController
public class UserController {

	@Autowired
	UserRepository repository;

	@GetMapping("/all")
	public List<User> getUsers() {
		return repository.findAll();
	}

	@PostMapping("/save")
	public User saveUser(@RequestBody User user) {
		return repository.save(user);
	}

	@GetMapping("/{uid}")
	public User getUserById(@PathVariable Integer uid) {
		return repository.findById(uid).orElseThrow(()->new RuntimeException("User Not found with id "+ uid));
	}

}
