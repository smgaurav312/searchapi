package com.example.demo.api;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.AuthorEntity;
import com.example.demo.model.Author;
import com.example.demo.model.Books;
import com.example.demo.model.PublishTask;
import com.example.demo.service.PublishingService;

import io.swagger.annotations.ApiParam;

/**
 * 
 *
 */

@RestController
@RequestMapping("/")
public class PublishingApiController implements PublishingApi {

	@Autowired
	PublishingService publishingService;

	@Override
	public ResponseEntity<String> addauthor(
			@ApiParam(value = "Author json", required = true) @Valid @RequestBody Author author) {

		if (!StringUtils.isEmpty(author)) {

			Author authors = author;
			publishingService.addAuthors(authors);

		}

		return new ResponseEntity<String>("Author added successfully", HttpStatus.OK);
	}
	
	//@Override
	public ResponseEntity<String> deleteAuthor(
			@ApiParam(value = "author Name", required = true) @RequestParam(value = "authorName", required = true) Integer authorId) {

		if (!StringUtils.isEmpty(authorId)) {

			publishingService.deleteAuthor(authorId);
			return new ResponseEntity<String>("Author added successfully", HttpStatus.OK);
		}

		return new ResponseEntity<String>("Invalid Request", HttpStatus.BAD_REQUEST);
	}
	
	//@Override
	public ResponseEntity<String> updateAuthor(
			@ApiParam(value = "Author json", required = true) @Valid @RequestBody Author author) {

		if (!StringUtils.isEmpty(author)) {

			Author authorToUpdate = author;
			publishingService.updateAuthor(authorToUpdate);
			return new ResponseEntity<String>("Author updated sucessfully", HttpStatus.OK);
		}

		return new ResponseEntity<String>("Invalid Request", HttpStatus.BAD_REQUEST);
	}
	
	//@Override
	public ResponseEntity<List<Author>> getAllAuthors() {


		List<Author> authEntities = publishingService.getAllAuthors();


		return new ResponseEntity<List<Author>>(authEntities, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<String> addPublishTask(
			@ApiParam(value = "Authors json", required = true) @Valid @RequestBody PublishTask publishTask) {

		if (!StringUtils.isEmpty(publishTask)) {

			PublishTask pubTasks = publishTask;
			publishingService.addPublishingTasks(pubTasks);

		}

		return new ResponseEntity<String>("Author added successfully", HttpStatus.OK);
	}
	
	//all books from a author in an year
	@Override
	public ResponseEntity<?> getAllBooksFromAnAuthorInYear(
			@ApiParam(value = "author Name", required = true) @RequestParam(value = "authorName", required = true) String authorName,
			@ApiParam(value = "return pubshingcation type - book", required = true) @RequestParam(value = "pubType", required = true) String pubType,
			@ApiParam(value = "published Year", required = true) @RequestParam(value = "publishedYear", required = true) Integer publishedYear) {

		List<Books> booksList = null;
		
		if (!StringUtils.isEmpty(authorName) && !StringUtils.isEmpty(pubType) && !StringUtils.isEmpty(publishedYear)) {

			booksList = publishingService.getAllBooksBasedOnAuthor(authorName, pubType, publishedYear);

		}

		return new ResponseEntity<List<Books>>(booksList, HttpStatus.OK);
	}

}
