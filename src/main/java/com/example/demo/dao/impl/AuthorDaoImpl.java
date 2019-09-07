package com.example.demo.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.AuthorDao;
import com.example.demo.entity.AuthorEntity;
import com.example.demo.entity.PublicationTaskEntity;
import com.example.demo.repository.AuthorRepository;
import com.example.demo.repository.PublishingTaskRepository;

@Component
public class AuthorDaoImpl implements AuthorDao {

	@Autowired
	AuthorRepository authorRepository;
	
	@Autowired
	PublishingTaskRepository publishingTaskRepository;


	@Override
	public void saveAnAuthor(AuthorEntity author) {
		try {
			authorRepository.saveAndFlush(author);
		} catch (Exception e) {
			throw e;
		}
	}
	
	@Override
	public void savePublishingTasks(PublicationTaskEntity publicationTaskEntity) {
		try {
			publishingTaskRepository.saveAndFlush(publicationTaskEntity);
		} catch (Exception e) {
			throw e;
		}
	}

}
