package com.example.demo.dao;

import com.example.demo.entity.AuthorEntity;
import com.example.demo.entity.PublicationTaskEntity;

public interface AuthorDao {

	void saveAnAuthor(AuthorEntity author);
	void savePublishingTasks(PublicationTaskEntity author);

}