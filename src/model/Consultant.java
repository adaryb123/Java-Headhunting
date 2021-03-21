package model;

import java.util.ArrayList;

public class Consultant extends Freelancer{
    public enum Specialization{
        APPLICATION,
        NETWORK,
        SAP,
        OTHER
    }
    private Specialization specializationField;
    private String preferredPlatform;

    public String getPreferredPlatform() {
        return preferredPlatform;
    }

    public void setPreferredPlatform(String preferredPlatform) {
        this.preferredPlatform = preferredPlatform;
    }

    public Specialization getSpecializationField() {
        return specializationField;
    }

    public void setSpecializationField(Specialization specializationField) {
        this.specializationField = specializationField;
    }

    public Consultant(String name, int dailyWage, int experienceYears, Education highestEducation, ArrayList<String> certificates, Specialization specializationField, String preferredPlatform) {
        this.setName(name);
        this.setDailyWage(dailyWage);
        this.setExperienceYears(experienceYears);
        this.setHighestEducation(highestEducation);
        this.setCertificates(certificates);
        this.specializationField = specializationField;
        this.preferredPlatform = preferredPlatform;
    }
}
