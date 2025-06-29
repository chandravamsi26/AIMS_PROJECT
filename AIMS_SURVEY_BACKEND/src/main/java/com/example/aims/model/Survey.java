package com.example.aims.model;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;

public class Survey {

    @Min(1)
    @Max(5)
    private int facialMuscles;

    @Min(1)
    @Max(5)
    private int lipsPerioral;

    @Min(1)
    @Max(5)
    private int jaw;

    @Min(1)
    @Max(5)
    private int tongue;

    @Min(1)
    @Max(5)
    private int upperExtremities;

    @Min(1)
    @Max(5)
    private int lowerExtremities;

    @Min(1)
    @Max(5)
    private int neckShouldersHips;

    @Min(1)
    @Max(5)
    private int severityOfMovements;

    @Min(1)
    @Max(5)
    private int incapacitationDueToMovements;

    @Min(1)
    @Max(5)
    private int patientAwareness;

    @Min(1)
    @Max(5)
    private int emotionalDistress;

    @Min(1)
    @Max(5)
    private int globalRating;

    private String patientId; // store patient ID instead of object

    public Survey() {
    }

    public Survey(int facialMuscles, int lipsPerioral, int jaw, int tongue, int upperExtremities,
                  int lowerExtremities, int neckShouldersHips, int severityOfMovements,
                  int incapacitationDueToMovements, int patientAwareness, int emotionalDistress,
                  int globalRating, String patientId) {
        this.facialMuscles = facialMuscles;
        this.lipsPerioral = lipsPerioral;
        this.jaw = jaw;
        this.tongue = tongue;
        this.upperExtremities = upperExtremities;
        this.lowerExtremities = lowerExtremities;
        this.neckShouldersHips = neckShouldersHips;
        this.severityOfMovements = severityOfMovements;
        this.incapacitationDueToMovements = incapacitationDueToMovements;
        this.patientAwareness = patientAwareness;
        this.emotionalDistress = emotionalDistress;
        this.globalRating = globalRating;
        this.patientId = patientId;
    }

    // Getters and Setters

    public int getFacialMuscles() {
        return facialMuscles;
    }

    public void setFacialMuscles(int facialMuscles) {
        this.facialMuscles = facialMuscles;
    }

    public int getLipsPerioral() {
        return lipsPerioral;
    }

    public void setLipsPerioral(int lipsPerioral) {
        this.lipsPerioral = lipsPerioral;
    }

    public int getJaw() {
        return jaw;
    }

    public void setJaw(int jaw) {
        this.jaw = jaw;
    }

    public int getTongue() {
        return tongue;
    }

    public void setTongue(int tongue) {
        this.tongue = tongue;
    }

    public int getUpperExtremities() {
        return upperExtremities;
    }

    public void setUpperExtremities(int upperExtremities) {
        this.upperExtremities = upperExtremities;
    }

    public int getLowerExtremities() {
        return lowerExtremities;
    }

    public void setLowerExtremities(int lowerExtremities) {
        this.lowerExtremities = lowerExtremities;
    }

    public int getNeckShouldersHips() {
        return neckShouldersHips;
    }

    public void setNeckShouldersHips(int neckShouldersHips) {
        this.neckShouldersHips = neckShouldersHips;
    }

    public int getSeverityOfMovements() {
        return severityOfMovements;
    }

    public void setSeverityOfMovements(int severityOfMovements) {
        this.severityOfMovements = severityOfMovements;
    }

    public int getIncapacitationDueToMovements() {
        return incapacitationDueToMovements;
    }

    public void setIncapacitationDueToMovements(int incapacitationDueToMovements) {
        this.incapacitationDueToMovements = incapacitationDueToMovements;
    }

    public int getPatientAwareness() {
        return patientAwareness;
    }

    public void setPatientAwareness(int patientAwareness) {
        this.patientAwareness = patientAwareness;
    }

    public int getEmotionalDistress() {
        return emotionalDistress;
    }

    public void setEmotionalDistress(int emotionalDistress) {
        this.emotionalDistress = emotionalDistress;
    }

    public int getGlobalRating() {
        return globalRating;
    }

    public void setGlobalRating(int globalRating) {
        this.globalRating = globalRating;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }
}
