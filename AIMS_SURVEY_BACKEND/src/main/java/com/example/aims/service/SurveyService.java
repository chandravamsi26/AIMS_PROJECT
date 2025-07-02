package com.example.aims.service;

import com.example.aims.model.Patient;
import com.example.aims.model.Survey;
import com.example.aims.repository.PatientRepository;
import com.example.aims.repository.SurveyRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SurveyService {

    private final PatientRepository patientRepository;
    private final SurveyRepository surveyRepository;

    public SurveyService(PatientRepository patientRepository, SurveyRepository surveyRepository) {
        this.patientRepository = patientRepository;
        this.surveyRepository = surveyRepository;
    }

    // Save Patient
    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    // Get all patients
    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    // Get patient by ID
    public Patient getPatientById(String id) {
        return patientRepository.findById(id).orElse(null);
    }

    public List<Patient> searchPatientsByName(String keyword) {
        String regex = ".*" + keyword + ".*"; // matches anywhere
        return patientRepository.searchByFullNameRegex(regex);
    }

    // Save Survey
    public Survey saveSurvey(Survey survey) {
        return surveyRepository.save(survey);
    }

    // Get all surveys
    public List<Survey> getAllSurveys() {
        return surveyRepository.findAll();
    }

    public Optional<Survey> getSurveyByPatientId(String patientId) {
        return surveyRepository.findByPatientId(patientId);
    }
}
