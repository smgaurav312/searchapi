package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.PublicationTaskEntity;

@Repository
@Transactional
public interface PublishingTaskRepository extends JpaRepository<PublicationTaskEntity, Integer> {

	
	//public Author findByAuthorId(long patientId) throws DataAccessException;
	
	
}
