package com.example.demo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.dao.AuthorDao;
import com.example.demo.entity.AuthorEntity;
import com.example.demo.entity.PublicationTaskEntity;
import com.example.demo.model.Author;
import com.example.demo.model.Books;
import com.example.demo.model.PublishTask;
import com.example.demo.repository.AuthorRepository;
import com.example.demo.repository.PublishingTaskRepository;
import com.example.demo.service.PublishingService;


public class PublishingServiceImpl implements PublishingService {

	@Autowired
	AuthorDao authorDao;
	
	@Autowired
	AuthorRepository authorRepository;
	
	@Autowired
	PublishingTaskRepository publishingTaskRepo;

	@Override
	public void addAuthors(Author authors) {
		AuthorEntity authEntity = new AuthorEntity();
		authEntity.setAuthorName(authors.getAuthorName());

		authorDao.saveAnAuthor(authEntity);


	}
	
	@Override
	public void deleteAuthor(Integer authorId) {
		authorRepository.delete(authorId);
	}
	
	@Override
	public void updateAuthor(Author author) {
		AuthorEntity authrEntity = new AuthorEntity();
		authrEntity.setAuthorId(author.getAuthorId());
		authrEntity.setAuthorName(author.getAuthorName());
		authorRepository.saveAndFlush(authrEntity);
	}
	
	@Override
	public List<Author> getAllAuthors() {
		
		List<AuthorEntity> authorlist = authorRepository.findAll();
		List<Author> authorListToSend  = new ArrayList<>();
		authorlist.forEach(item->{
			Author author = new Author();
			author.setAuthorId(item.getAuthorId());
			author.setAuthorName(item.getAuthorName());
			authorListToSend.add(author);
		});
		return authorListToSend;
		
	}
	
	@Override
	public void addPublishingTasks(PublishTask publishTask) {
		PublicationTaskEntity pubTaskEntity = new PublicationTaskEntity();
		pubTaskEntity.setCategoryType(publishTask.getCategoryType());
		pubTaskEntity.setAuthorId(publishTask.getAuthorId());
		pubTaskEntity.setPublishedYear(publishTask.getPublishedYear());
		pubTaskEntity.setPublishingWhat(publishTask.getPublishingWhat());
		pubTaskEntity.setTitle(publishTask.getTitle());

		authorDao.savePublishingTasks(pubTaskEntity);


	}
	
	@Override
	public List<Books> getAllBooksBasedOnAuthor(String authorName, String pubType, Integer publishedYear) {
		
		AuthorEntity authorEntity = authorRepository.findByAuthorName(authorName);
		List<Books> bookList = new ArrayList<>();
		List<PublicationTaskEntity> publishingTaskList  = publishingTaskRepo.findByAuthorIdAndPublishedYearAndPublishingWhat(authorEntity.getAuthorId(), publishedYear, pubType);
		for (int i = 0; i < publishingTaskList.size() ; i++) {
			Books book = new Books();
					book.setGenre(publishingTaskList.get(i).getCategoryType());
			book.setTitle(publishingTaskList.get(i).getTitle());
			book.setYear(publishingTaskList.get(i).getPublishedYear());
			bookList.add(book);
		}

		return bookList;


	}

}
