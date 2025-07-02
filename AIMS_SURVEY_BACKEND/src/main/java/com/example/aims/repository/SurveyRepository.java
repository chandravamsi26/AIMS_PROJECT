package com.example.aims.repository;

import com.example.aims.model.Survey;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface SurveyRepository extends MongoRepository<Survey, String> {
    Optional<Survey> findByPatientId(String patientId);
}
