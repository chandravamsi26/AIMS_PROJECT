// In-memory patient repo
package com.example.aims.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.example.aims.model.Patient;

@Repository
public class PatientRepository {

    private final List<Patient> patients = new ArrayList<>();

    public void save(Patient patient) {
        patients.add(patient);
    }

    public List<Patient> findAll() {
        return new ArrayList<>(patients);
    }

    public List<Patient> searchByName(String keyword) {
        String lowerKeyword = keyword.toLowerCase();
        return patients.stream()
                .filter(p -> p.getFirstName().toLowerCase().contains(lowerKeyword) ||
                             p.getLastName().toLowerCase().contains(lowerKeyword))
                .collect(Collectors.toList());
    }
}
// In-memory patient repo