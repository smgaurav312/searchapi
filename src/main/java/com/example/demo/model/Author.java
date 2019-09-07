/**
 * 
 */
package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;


@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-16T17:08:39.291Z")
public class Author {

	/*@JsonProperty("authorId")
	private Long authorId = null;*/
	
	@JsonProperty("authorName")
	private String authorName = null;
	
	/*@JsonProperty("title")
	private String title = null;
	
	
	@JsonProperty("publishedYear")
	private Integer publishedYear = null;
	
	
	@JsonProperty("categoryType")
	private String categoryType = null;
	
	@JsonProperty("publishingId")
	private String publishingId = null;*/
	
	

	/*public Long getAuthorId() {
		return authorId;
	}

	public void setAuthorId(Long authorId) {
		this.authorId = authorId;
	}*/

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	/*public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getPublishedYear() {
		return publishedYear;
	}

	public void setPublishedYear(Integer publishedYear) {
		this.publishedYear = publishedYear;
	}

	public String getCategoryType() {
		return categoryType;
	}

	public void setCategoryType(String categoryType) {
		this.categoryType = categoryType;
	}

	public String getPublishingId() {
		return publishingId;
	}

	public void setPublishingId(String publishingId) {
		this.publishingId = publishingId;
	}*/

	

}
