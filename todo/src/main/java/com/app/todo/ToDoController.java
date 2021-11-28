package com.app.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.todo.request.TaskRequest;
import com.app.todo.service.ToDoService;

@CrossOrigin(origins = "*",maxAge = 3600)
@RestController
@RequestMapping("/api")
public class ToDoController {
	
	@Autowired
	ToDoService todoService;

	@PostMapping("task/create")
	public String createTask(@RequestBody TaskRequest requestTask) {
		todoService.createTask(requestTask);
		return "task created successfully.";
	}
}
