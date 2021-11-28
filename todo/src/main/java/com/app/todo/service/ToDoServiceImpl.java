package com.app.todo.service;

import java.util.Date;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.todo.constant.StatusEnum;
import com.app.todo.dao.TaskRepo;
import com.app.todo.dao.entities.Task;
import com.app.todo.request.TaskRequest;
@Service
public class ToDoServiceImpl implements ToDoService{
	
	@Autowired
	TaskRepo taskRepo;

	@Override
	public Task createTask(TaskRequest requestTask) {
		
		String uniqueID = UUID.randomUUID().toString();
		Task task=new Task();
		task.setId(uniqueID);
		task.setName(requestTask.getName());
		task.setDescription(requestTask.getDescription());
		task.setStatus(StatusEnum.TODO.name());
		task.setCreationTime(new Date());
		task.setUpdationTime(new Date());
		task.setTargetDate(requestTask.getTargetDate());
		task.setTargetTime(requestTask.getTargetTime());
		
		
		return taskRepo.save(task);
	}
	
	

}
