package model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Contract {
    private JobOffer jobOffer;
    private ArrayList<Freelancer> freelancers;
    private String date;

    public Contract(JobOffer jobOffer, ArrayList<Freelancer> freelancers) {
        this.jobOffer = jobOffer;
        this.freelancers = freelancers;

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        this.date = formatter.format(date);
    }

    public JobOffer getJobOffer() {
        return jobOffer;
    }

    public void setJobOffer(JobOffer jobOffer) {
        this.jobOffer = jobOffer;
    }

    public ArrayList<Freelancer> getFreelancers() {
        return freelancers;
    }

    public void setFreelancers(ArrayList<Freelancer> freelancers) {
        this.freelancers = freelancers;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
