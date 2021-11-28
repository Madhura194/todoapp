package com.app.todo.dao.entities;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User {
	
	@Id
	String id;
	String username;
	String password;
	
	List<String> authorities;
	List<Task> tasks;
	
	

}
