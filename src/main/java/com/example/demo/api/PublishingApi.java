package com.example.demo.api;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Author;
import com.example.demo.model.ErrorResponse;
import com.example.demo.model.PublishTask;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-12T17:55:43.543Z")

@Api(value = "Publication", description = "the default API")
public interface PublishingApi {

	@ApiOperation(value = "adds author", notes = "", response = Void.class, tags = {
			"add authors API", })
	@ApiResponses(value = { 
			@ApiResponse(code = 201, message = "Successfully Added", response = Void.class),
			@ApiResponse(code = 200, message = "No changes", response = Void.class),
			@ApiResponse(code = 400, message = "Bad Request. Please see response body for more details", response = ErrorResponse.class),
			@ApiResponse(code = 401, message = "Unauthorized", response = Void.class),
			@ApiResponse(code = 500, message = "Internal Server Error", response = ErrorResponse.class) })

	@RequestMapping(value = "v1/addauthor", consumes = {
	   "application/json" }, method = RequestMethod.PUT)
	ResponseEntity<String> addauthor(@ApiParam(value = "Authors json", required = true) @Valid @RequestBody Author author);

	
	@ApiOperation(value = "adds Publishing Task", notes = "", response = Void.class, tags = {
			"add authors API", })
	@ApiResponses(value = { 
			@ApiResponse(code = 201, message = "Successfully Added", response = Void.class),
			@ApiResponse(code = 200, message = "No changes", response = Void.class),
			@ApiResponse(code = 400, message = "Bad Request. Please see response body for more details", response = ErrorResponse.class),
			@ApiResponse(code = 401, message = "Unauthorized", response = Void.class),
			@ApiResponse(code = 500, message = "Internal Server Error", response = ErrorResponse.class) })

	@RequestMapping(value = "v1/addPublishTask", consumes = {
	   "application/json" }, method = RequestMethod.PUT)
	ResponseEntity<String> addPublishTask(@ApiParam(value = "publishing json", required = true) @Valid @RequestBody PublishTask publishTask);

	
	@ApiOperation(value = "get books by author and published year", notes = "", response = Void.class, tags = {
			"add authors API", })
	@ApiResponses(value = { 
			@ApiResponse(code = 201, message = "Successfully Added", response = Void.class),
			@ApiResponse(code = 200, message = "No changes", response = Void.class),
			@ApiResponse(code = 400, message = "Bad Request. Please see response body for more details", response = ErrorResponse.class),
			@ApiResponse(code = 401, message = "Unauthorized", response = Void.class),
			@ApiResponse(code = 500, message = "Internal Server Error", response = ErrorResponse.class) })

	@RequestMapping(value = "v1/getBooksByAuthorsAndpublishedYear", consumes = {
	   "application/json" }, method = RequestMethod.PUT)
	ResponseEntity<?> getAllBooksFromAnAuthorInYear(
			@ApiParam(value = "author Name", required = true) @RequestParam(value = "authorName", required = true) String authorName,
			@ApiParam(value = "return pubshingcation type - book", required = true) @RequestParam(value = "pubType", required = true) String pubType,
			@ApiParam(value = "published Year", required = true) @RequestParam(value = "publishedYear", required = true) Integer publishedYear);

	
	
}
