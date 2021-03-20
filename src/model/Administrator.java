package model;

import java.util.ArrayList;

public class Administrator extends Freelancer{
    private boolean auditorNBU;

    public boolean isAuditorNBU() {
        return auditorNBU;
    }

    public void setAuditorNBU(boolean auditorNBU) {
        this.auditorNBU = auditorNBU;
    }

    public Administrator(double dailyWage, int experienceYears, Freelancer.Education highestEducation, ArrayList<String> certificates, boolean auditorNBU) {
        this.setDailyWage(dailyWage);
        this.setExperienceYears(experienceYears);
        this.setHighestEducation(highestEducation);
        this.setCertificates(certificates);
        this.auditorNBU = auditorNBU;
    }
}
