package com.example.demo.response;

import java.util.Date;

public class TaskResponse {
	Date created_at;
	Date expiring_at;
	String type;
    Date updated_at;
    Long task_token;
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	public Date getExpiring_at() {
		return expiring_at;
	}
	public void setExpiring_at(Date expiring_at) {
		this.expiring_at = expiring_at;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Date getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}
	public Long getTask_token() {
		return task_token;
	}
	public void setTask_token(Long task_token) {
		this.task_token = task_token;
	}

}
