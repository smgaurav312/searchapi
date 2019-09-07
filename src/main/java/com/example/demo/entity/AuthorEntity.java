package com.example.demo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "author")
public class AuthorEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "author_ID", insertable = false, updatable = false)
	private long authorId;

	

	@Column(name = "author_name")
	private String authorName;

	

	public AuthorEntity() {
	}



	public long getAuthorId() {
		return authorId;
	}



	public void setAuthorId(long authorId) {
		this.authorId = authorId;
	}



	public String getAuthorName() {
		return authorName;
	}



	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	

}