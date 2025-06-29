// In-memory survey repo
package com.example.aims.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.aims.model.*;


@Repository
public class SurveyRepository {

    private final List<Survey> surveys = new ArrayList<>();

    public void save(Survey survey) {
        surveys.add(survey);
    }

    public List<Survey> findAll() {
        return new ArrayList<>(surveys);
    }
}

// In-memory survey repo