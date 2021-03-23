package controller;

import model.*;

import java.util.ArrayList;

public class DataStorage {
    public static ArrayList<Freelancer> freelancers = new ArrayList<>();
    public static ArrayList<Company> companies = new ArrayList<>();
    public static ArrayList<Contract> contracts = new ArrayList<>();
    public static ArrayList<JobOffer> jobOffers = new ArrayList<>();

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

    public static void createInitialData(){
        String imageURI1 = "file:/C:/Users/uzivatel/Desktop/workspace/zadanie2/src/view/images/microsoft.png";
        String imageURI2 = "file:/C:/Users/uzivatel/Desktop/workspace/zadanie2/src/view/images/tesla.png";

        Company company1 = new Company("TESLA","Smart cars",5000,imageURI2);
        Company company2 = new Company("Microsoft","Computers",12300,imageURI1);

        ArrayList<String> certificates = new ArrayList<String>();
        certificates.add("CISCO 1");
        certificates.add("CDP");
        Programmer programmer = new Programmer("John Smith",40,5,
                Freelancer.Education.DOCTORATE,certificates, Programmer.Language.PYTHON);
        certificates.add("CCNA");
        Consultant consultant = new Consultant("Jane Doe",25,10,
                Freelancer.Education.MASTERS, certificates,true);

        JobOffer jobOffer1 = new JobOffer(company1,"Computer networks manager","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam ultrices ligula nec ex bibendum maximus. Sed id vestibulum ex. Cras et ex nisl. Proin vehicula felis ac hendrerit facilisis.");
        JobOffer jobOffer2 = new JobOffer(company1,"Networks architect","Nam aliquet nisl sed massa ultricies euismod. Phasellus id pellentesque augue. In orci enim, convallis et sodales quis, elementum non orci. Aenean ac dui et augue hendrerit fermentum nec id ipsum. ");
        JobOffer jobOffer3 = new JobOffer(company2,"Systems analyst","Nulla quam nisl, accumsan et neque id, aliquam semper mi. Mauris at fringilla est, eu interdum elit. Phasellus at aliquet nisi. Donec tempor tristique ex non cursus. ");
        JobOffer jobOffer4 = new JobOffer(company2,"IT coordinator","ed at purus a nulla viverra porta. Vestibulum iaculis eleifend ipsum eget lobortis. Duis dignissim blandit justo. Integer vel semper mauris. Vivamus luctus luctus gravida. Cras interdum risus sit amet eleifend posuere. Pellentesque vitae iaculis enim. Donec in cursus risus. ");
        JobOffer jobOffer5 = new JobOffer(company1,"Junior developer","Vivamus ut est leo. Sed consectetur posuere eros ut sollicitudin. Duis condimentum tellus non nisi hendrerit, non consectetur tortor iaculis. Nunc eu purus aliquam, fermentum ligula a, euismod magna. Proin et enim eu justo ultrices interdum a a massa. Nullam ultrices in massa at viverra.");

        companies.add(company1);
        companies.add(company2);

        freelancers.add(programmer);
        freelancers.add(consultant);

        jobOffers.add(jobOffer1);
        jobOffers.add(jobOffer2);
        jobOffers.add(jobOffer3);
        jobOffers.add(jobOffer4);
        jobOffers.add(jobOffer5);
    }
}
