package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.dao.AuthorDao;
import com.example.demo.entity.AuthorEntity;
import com.example.demo.entity.PublicationTaskEntity;
import com.example.demo.model.Author;
import com.example.demo.model.PublishTask;
import com.example.demo.service.PublishingService;


public class PublishingServiceImpl implements PublishingService {

	@Autowired
	AuthorDao authorDao;

	@Override
	public void addAuthors(Author authors) {
		AuthorEntity authEntity = new AuthorEntity();
		authEntity.setAuthorName(authors.getAuthorName());

		authorDao.saveAnAuthor(authEntity);


	}

	@Override
	public void addPublishingTasks(PublishTask publishTask) {
		PublicationTaskEntity pubTaskEntity = new PublicationTaskEntity();
		pubTaskEntity.setCategoryType(publishTask.getCategoryType());
		pubTaskEntity.setAuthorId(publishTask.getAuthorId());
		pubTaskEntity.setPublishedYear(publishTask.getPublishedYear());
		pubTaskEntity.setPublishingId(publishTask.getPublishingId());
		pubTaskEntity.setTitle(publishTask.getTitle());

		authorDao.savePublishingTasks(pubTaskEntity);


	}

}
