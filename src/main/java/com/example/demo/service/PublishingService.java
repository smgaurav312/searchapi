package com.example.demo.service;

import java.util.List;
import com.example.demo.model.Author;
import com.example.demo.model.Books;
import com.example.demo.model.PublishTask;

public interface PublishingService {

	void addAuthors(Author authors);
	void deleteAuthor(Integer authorId);
	void addPublishingTasks(PublishTask publishTask);
	List<Books> getAllBooksBasedOnAuthor(String authorId, String pubType, Integer publishedYear);
	
}
