package com.app.todo.request;

import org.springframework.data.mongodb.core.mapping.DBRef;

import com.app.todo.dao.entities.User;

public class TaskRequest {
	
  String name;
  String description;
  String targetDate;
  String targetTime;
  
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getTargetDate() {
	return targetDate;
}
public void setTargetDate(String targetDate) {
	this.targetDate = targetDate;
}
public String getTargetTime() {
	return targetTime;
}
public void setTargetTime(String targetTime) {
	this.targetTime = targetTime;
}
  
  

  

}
