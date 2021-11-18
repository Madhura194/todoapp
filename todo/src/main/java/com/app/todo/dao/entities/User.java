package com.app.todo.dao.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User {
	
	@Id
	String id;
	String username;
	String password;
	
	List<String> authorities;
	@OneToMany(mappedBy = "user")
	List<Task> tasks;
	
	

}
