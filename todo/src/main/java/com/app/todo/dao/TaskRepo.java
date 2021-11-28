package com.app.todo.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.app.todo.dao.entities.Task;

public interface TaskRepo extends MongoRepository<Task, String>{

}
