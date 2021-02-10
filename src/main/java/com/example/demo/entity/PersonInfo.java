package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Person_info")
public class PersonInfo {
	
	
	public PersonInfo(Long id, String channel, String conversationId, String country) {
		super();
		this.id = id;
		this.channel = channel;
		this.conversationId = conversationId;
		this.country = country;
	}
	public PersonInfo() {
		
	}
	@Id
	@GeneratedValue
	@Column(name="id",updatable = false, nullable = false)
	private Long id;
	@Column(name = "channel")
	String channel;
	@Column(name = "conversationId")
	String conversationId;
	@Column(name= "country")
	String country;
	//@OneToMany(fetch=FetchType.LAZY, mappedBy = "person_id")
	//Person person;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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
	@Override
	public String toString() {
		return "PersonInfo [id=" + id + ", channel=" + channel + ", conversationId=" + conversationId + ", country="
				+ country + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((channel == null) ? 0 : channel.hashCode());
		result = prime * result + ((conversationId == null) ? 0 : conversationId.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PersonInfo other = (PersonInfo) obj;
		if (channel == null) {
			if (other.channel != null)
				return false;
		} else if (!channel.equals(other.channel))
			return false;
		if (conversationId == null) {
			if (other.conversationId != null)
				return false;
		} else if (!conversationId.equals(other.conversationId))
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
