package com.example.demo.request;

public class TaskInfo{
	
	String channel;
	String conversationId;
	String country;
	RequestEnch requestEnch;
	public String getChannel() {
		return channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}
	public String getConversationId() {
		return conversationId;
	}
	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public RequestEnch getRequestEnch() {
		return requestEnch;
	}
	public void setRequestEnch(RequestEnch requestEnch) {
		this.requestEnch = requestEnch;
	}

}
