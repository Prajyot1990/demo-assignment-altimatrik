package com.example.demo.entity;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Task")
public class TaskData {
	@Id
	@GeneratedValue
	private Long id;
	@Column(name = "taskName")
	String taskName;
	@Column(name = "Description")
	String description;
	@Column(name = "createdAt")
	Date createdAt;
	@Column(name = "expiredAt")
	Date expiredAt;
	@Column(name = "updatedAt")
	Date updatedAt;
	@Column(name = "taskToken")
	String taskToken;
	@Column(name = "status")
	String status;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getCreatedAt() {
		return new Date();
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getExpiredAt() {
		Date dt = new Date();
		Calendar c = Calendar.getInstance(); 
		c.setTime(dt); 
		c.add(Calendar.DATE, 15);
		dt = c.getTime();
		return dt;
	}
	public void setExpiredAt(Date expiredAt) {
		this.expiredAt = expiredAt;
	}
	public String getTaskToken() {
		return taskToken;
	}
	public void setTaskToken(String taskToken) {
		this.taskToken = taskToken;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
}
