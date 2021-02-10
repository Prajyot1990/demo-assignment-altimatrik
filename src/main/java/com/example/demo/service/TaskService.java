package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.example.demo.entity.TaskData;
import com.example.demo.repository.TaskRepository;
import com.example.demo.request.TaskInfo;
import com.example.demo.response.TaskMsg;
import com.example.demo.response.TaskResponse;
import com.example.demo.util.EncryptDecrypt;
import com.google.gson.Gson;

@Service
public class TaskService {
	
	@Autowired
	TaskRepository taskRepository;
	
	@Value("${jwt.secret.key}")
	String key;
	
	public TaskResponse saveInformation(TaskInfo information) {
		String encryptedData=information.getRequestEnch().getBlob();
		String taskJson=EncryptDecrypt.decrypt(key, encryptedData);
		Gson gson = new Gson(); 
		TaskData taskInfo=gson.fromJson(taskJson,TaskData.class);
		taskInfo.setStatus("NEW");
		taskInfo=taskRepository.save(taskInfo);
		TaskResponse task=new TaskResponse();
		task.setCreated_at(taskInfo.getCreatedAt());
		task.setExpiring_at(taskInfo.getExpiredAt());
		task.setType(taskInfo.getTaskName());
		task.setUpdated_at(taskInfo.getUpdatedAt());
		task.setTask_token(taskInfo.getId());
		return task;
	}
	
	public TaskMsg updateTask(TaskResponse information) {
		TaskData t=taskRepository.getOne(1L);
		t.setStatus("RESUMED");
		taskRepository.saveAndFlush(t);
		TaskMsg taskMsg=new TaskMsg();
		taskMsg.setMsg("Tasked Resumed");
		taskMsg.setStatus("SUCCESS");
		return taskMsg;
		
	}

}
