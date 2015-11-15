package com.soni.messenger.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@XmlRootElement
@Getter @Setter @NoArgsConstructor
public class Message {
	
	public Message(long id, String message, String author){
		this.id = id;
		this.created = new Date();
		this.message = message;
		this.author = author;
	}
	
	private long id;
	private String message;
	private Date created;
	private String author;
	
	private Map<Long, Comment> comments = new HashMap<>();
	private List<Link> links = new ArrayList<>();
}
