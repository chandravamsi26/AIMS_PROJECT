package com.example.aims.controller;

import com.example.aims.model.Patient;
import com.example.aims.model.Survey;
import com.example.aims.service.PdfService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.*;

@RestController
@RequestMapping("/api")
public class SurveyController {

    private final List<Patient> patients = new ArrayList<>();
    private final List<Survey> surveys = new ArrayList<>();
    private final PdfService pdfService;

    public SurveyController(PdfService pdfService) {
        this.pdfService = pdfService;
    }

    @PostMapping("/patients")
    public ResponseEntity<Patient> savePatient(@RequestBody Patient patient) {
        String id = UUID.randomUUID().toString();
        patient.setId(id);
        patients.add(patient);
        return ResponseEntity.ok(patient);
    }

    @GetMapping("/patients")
    public ResponseEntity<List<Patient>> getAllPatients() {
        return ResponseEntity.ok(patients);
    }

    @GetMapping("/patients/{id}")
    public ResponseEntity<Patient> getPatientById(@PathVariable String id) {
        return patients.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/patients/search-results")
    public ResponseEntity<List<Patient>> searchPatients(@RequestBody Map<String, String> payload) {
        String keyword = payload.get("keyword");
        List<Patient> matched = new ArrayList<>();

        for (Patient p : patients) {
            if (p.getFirstName().equalsIgnoreCase(keyword) ||
                    p.getLastName().equalsIgnoreCase(keyword)) {
                matched.add(p);
            }
        }

        return ResponseEntity.ok(matched);
    }

    @PostMapping("/surveys")
    public ResponseEntity<Survey> saveSurvey(@RequestBody Survey survey) {
        surveys.add(survey);
        return ResponseEntity.ok(survey);
    }

    @PostMapping("/download-pdf")
    public void downloadPdf(@RequestBody Map<String, Object> payload, HttpServletResponse response) {
        ObjectMapper mapper = new ObjectMapper();

        Patient patient = mapper.convertValue(payload.get("patient"), Patient.class);
        Survey survey = mapper.convertValue(payload.get("survey"), Survey.class);
        String chartBase64 = (String) payload.get("chartImage");

        if (patient != null && survey != null) {
            pdfService.generatePdf(patient, survey, chartBase64, response);
        } else {
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
        }
    }
}
