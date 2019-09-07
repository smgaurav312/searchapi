package com.example.demo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "publication_entries")
public class PublicationTaskEntity implements Serializable {
	@Id
	@Column(name = "id", insertable = false, updatable = false)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "Publication_Task_Entity_Id")
	@SequenceGenerator(sequenceName = "Publication_Task_Entity_Id_seq", initialValue = 1, allocationSize = 1, name = "Publication_Task_Entity_Id")
	private Integer id;

	@Column(name = "author_id")
	private Integer authorId;
	
	@Column(name = "publishing_What")
	private String publishingWhat;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "published_year")
	private Integer publishedYear;
	
	@Column(name = "category_type")
	private String categoryType;

	public PublicationTaskEntity() {
	}
	
	public Integer getId() {
		return id;
	}





	public void setId(Integer id) {
		this.id = id;
	}





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

	public String getTitle() {
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





	private static final long serialVersionUID = 1L;

	



	
	

}