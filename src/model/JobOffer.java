package model;

public class JobOffer {
    private Company company;
    private double dailySalary;
    private String name;
    private String info;

    public JobOffer(Company company, double dailySalary, String name, String info) {
        this.company = company;
        this.dailySalary = dailySalary;
        this.name = name;
        this.info = info;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public double getDailySalary() {
        return dailySalary;
    }

    public void setDailySalary(double dailySalary) {
        this.dailySalary = dailySalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
