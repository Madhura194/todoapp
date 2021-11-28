package com.app.todo.service;

import com.app.todo.dao.entities.Task;
import com.app.todo.request.TaskRequest;

public interface ToDoService {

	public Task createTask(TaskRequest requestTask);
	
}
