package com.example.demo.api;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Author;
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

	public ResponseEntity<String> addauthor(
			@ApiParam(value = "Author json", required = true) @Valid @RequestBody Author author) {

		if (!StringUtils.isEmpty(author)) {

			Author authors = author;
			publishingService.addAuthors(authors);

		}

		return new ResponseEntity<String>("Author added successfully", HttpStatus.OK);
	}

	public ResponseEntity<String> addPublishTask(
			@ApiParam(value = "Authors json", required = true) @Valid @RequestBody PublishTask publishTask) {

		if (!StringUtils.isEmpty(publishTask)) {

			PublishTask pubTasks = publishTask;
			publishingService.addPublishingTasks(pubTasks);

		}

		return new ResponseEntity<String>("Author added successfully", HttpStatus.OK);
	}

}
