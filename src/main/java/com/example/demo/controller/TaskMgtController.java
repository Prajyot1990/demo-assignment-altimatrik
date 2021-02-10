package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.TaskData;
import com.example.demo.request.TaskInfo;
import com.example.demo.response.TaskMsg;
import com.example.demo.response.TaskResponse;
import com.example.demo.service.TaskService;

@RestController
public class TaskMgtController {

	

	@Autowired
	TaskService taskService;
	
	@PostMapping("task/saveTask")
	public TaskResponse saveTask(@RequestBody TaskInfo information) {
		System.out.println("request start");
		return taskService.saveInformation(information);
		
	}
	
	@PutMapping("task/updateTask")
	public TaskMsg updateTask(TaskResponse information) {
		return taskService.updateTask(information);
	}
}
