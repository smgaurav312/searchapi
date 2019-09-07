package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.AuthorEntity;

@Repository
@Transactional
public interface AuthorRepository extends JpaRepository<AuthorEntity, Long> {

	
	//public Author findByAuthorId(long patientId) throws DataAccessException;
	
	
}
