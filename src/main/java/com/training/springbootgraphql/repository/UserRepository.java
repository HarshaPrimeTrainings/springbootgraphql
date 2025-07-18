package com.training.springbootgraphql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.training.springbootgraphql.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
