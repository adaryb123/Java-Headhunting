package model;

import java.util.ArrayList;

public class Programmer extends Freelancer{
    public enum Language{
        JAVA,
        CPP,
        ABAP,
        VBA,
        PYTHON,
        RUBY,
        IOS,
        OTHER
    }
    private Language preferredLanguage;

    public Language getPreferredLanguage() {
        return preferredLanguage;
    }

    public void setPreferredLanguage(Language preferredLanguage) {
        this.preferredLanguage = preferredLanguage;
    }

    public Programmer(double dailyWage, int experienceYears, Education highestEducation, ArrayList<String> certificates, Language preferredLanguage) {
        this.setDailyWage(dailyWage);
        this.setExperienceYears(experienceYears);
        this.setHighestEducation(highestEducation);
        this.setCertificates(certificates);
        this.preferredLanguage = preferredLanguage;
    }
}
