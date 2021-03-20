package controller;

import model.Company;
import model.Contract;
import model.Freelancer;
import model.JobOffer;

import java.util.ArrayList;

public class DataStorage {
    public static ArrayList<Freelancer> freelancers;
    public static ArrayList<Company> companies;
    public static ArrayList<Contract> contracts;
    public static ArrayList<JobOffer> jobOffers;

    private DataStorage() {
    }

    public static ArrayList<Freelancer> getFreelancers() {
        return freelancers;
    }

    public static void setFreelancers(ArrayList<Freelancer> freelancers) {
        DataStorage.freelancers = freelancers;
    }

    public static ArrayList<Company> getCompanies() {
        return companies;
    }

    public static void setCompanies(ArrayList<Company> companies) {
        DataStorage.companies = companies;
    }

    public static ArrayList<Contract> getContracts() {
        return contracts;
    }

    public static void setContracts(ArrayList<Contract> contracts) {
        DataStorage.contracts = contracts;
    }

    public static ArrayList<JobOffer> getJobOffers() {
        return jobOffers;
    }

    public static void setJobOffers(ArrayList<JobOffer> jobOffers) {
        DataStorage.jobOffers = jobOffers;
    }
}
