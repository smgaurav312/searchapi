/**
 * 
 */
package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;


@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-16T17:08:39.291Z")
public class Books {

	/*@JsonProperty("authorId")
	private Long authorId = null;*/
	
	@JsonProperty("title")
	private String title = null;
	
	@JsonProperty("year")
	private Integer year = null;
	
	@JsonProperty("genre")
	private String genre = null;
	
	public Books() {
		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	

}
