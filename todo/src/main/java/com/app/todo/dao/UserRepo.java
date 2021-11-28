package com.app.todo.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.app.todo.dao.entities.User;

public interface UserRepo extends MongoRepository<User,String> {

}
