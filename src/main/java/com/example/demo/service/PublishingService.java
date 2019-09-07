package com.example.demo.service;

import com.example.demo.model.PublishTask;
import com.example.demo.model.Author;

public interface PublishingService {

	void addAuthors(Author authors);
	void addPublishingTasks(PublishTask publishTask);
	
}
