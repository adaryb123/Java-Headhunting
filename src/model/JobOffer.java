package model;

public class JobOffer {
    private Company company;
    private String jobTitle;
    private String info;

    public JobOffer(Company company, String jobTitle, String info) {
        this.company = company;
        this.jobTitle = jobTitle;
        this.info = info;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
