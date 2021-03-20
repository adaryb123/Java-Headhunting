package model;

import java.util.ArrayList;

public class Contract {
    private JobOffer jobOffer;
    private ArrayList<Freelancer> freelancers;

    public Contract(JobOffer jobOffer, ArrayList<Freelancer> freelancers) {
        this.jobOffer = jobOffer;
        this.freelancers = freelancers;
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
}
