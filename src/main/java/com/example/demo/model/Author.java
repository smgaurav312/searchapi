/**
 * 
 */
package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;


@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-16T17:08:39.291Z")
public class Author {

	@JsonProperty("authorId")
	private Integer authorId = null;
	
	@JsonProperty("authorName")
	private String authorName = null;
	
	

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public Integer getAuthorId() {
		return authorId;
	}

	public void setAuthorId(Integer authorId) {
		this.authorId = authorId;
	}

	

	

}
