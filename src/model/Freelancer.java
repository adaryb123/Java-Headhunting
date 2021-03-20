package model;

import java.util.ArrayList;

public abstract class Freelancer {
    private String name;
    private double dailyWage;
    private int experienceYears;
    public enum Education{
        HIGH_SCHOOL,
        ASSOCIATE,
        BACHELORS,
        MASTERS,
        DOCTORATE
    }
    private Education highestEducation;
    private ArrayList<String> certificates;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getCertificates() {
        return certificates;
    }

    public void setCertificates(ArrayList<String> certificates) {
        this.certificates = certificates;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    public double getDailyWage() {
        return dailyWage;
    }

    public void setDailyWage(double dailyWage) {
        this.dailyWage = dailyWage;
    }

    public Education getHighestEducation() {
        return highestEducation;
    }

    public void setHighestEducation(Education highestEducation) {
        this.highestEducation = highestEducation;
    }

}
