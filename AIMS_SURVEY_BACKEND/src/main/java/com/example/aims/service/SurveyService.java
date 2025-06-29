package com.example.aims.service;

import com.example.aims.model.Patient;
import com.example.aims.model.Survey;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class SurveyService {

    private final List<Patient> patients = new ArrayList<>();
    private final List<Survey> surveys = new ArrayList<>();

    public void saveSurveyWithPatient(Survey survey, Patient patient) {
        // Assign unique ID to patient
        String id = UUID.randomUUID().toString();
        patient.setId(id);
        patients.add(patient);

        // Assign patientId to survey
        survey.setPatientId(id);
        surveys.add(survey);
    }

    public List<Patient> searchPatientsByName(String keyword) {
        List<Patient> matched = new ArrayList<>();
        for (Patient p : patients) {
            if (p.getFirstName().equalsIgnoreCase(keyword) ||
                    p.getLastName().equalsIgnoreCase(keyword)) {
                matched.add(p);
            }
        }
        return matched;
    }

    public List<Survey> getAllSurveys() {
        return surveys;
    }
}
