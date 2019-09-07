/**
 * 
 */
package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;


@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-08-28T17:08:39.291Z")
public class PublishTask {

	@JsonProperty("authorId")
	private Integer authorId = null;
	
	@JsonProperty("publishingWhat")
	private String publishingWhat = null;
	
	@JsonProperty("title")
	private String title = null;
	
	@JsonProperty("publishedYear")
	private Integer publishedYear = null;
	
	@JsonProperty("categoryType")
	private String categoryType = null;

	public Integer getAuthorId() {
		return authorId;
	}

	public void setAuthorId(Integer authorId) {
		this.authorId = authorId;
	}

	public String getPublishingWhat() {
		return publishingWhat;
	}

	public void setPublishingWhat(String publishingWhat) {
		this.publishingWhat = publishingWhat;
	}

	public Integer getPublishedYear() {
		return publishedYear;
	}

	public void setPublishedYear(Integer publishedYear) {
		this.publishedYear = publishedYear;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	

	public String getCategoryType() {
		return categoryType;
	}

	public void setCategoryType(String categoryType) {
		this.categoryType = categoryType;
	}

}
