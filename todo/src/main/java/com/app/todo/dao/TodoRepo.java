package com.app.todo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.todo.dao.entities.Task;

public interface TodoRepo extends JpaRepository<Task,String> {

}
