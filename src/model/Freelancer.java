package model;

import java.util.ArrayList;

public abstract class Freelancer {
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
