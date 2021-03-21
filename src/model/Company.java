package model;

public class Company {
    String name;
    String businessField;
    int employeesNum;
    String logoImageURI;

    public Company(String name, String businessField, int employeesNum, String logoImageURI) {
        this.name = name;
        this.businessField = businessField;
        this.employeesNum = employeesNum;
        this.logoImageURI = logoImageURI;
    }

    public String getlogoImageURI() {
        return logoImageURI;
    }

    public void setlogoImageURI(String logoImageURI) {
        this.logoImageURI = logoImageURI;
    }

    public int getEmployeesNum() {
        return employeesNum;
    }

    public void setEmployeesNum(int employeesNum) {
        this.employeesNum = employeesNum;
    }

    public String getBusinessField() {
        return businessField;
    }

    public void setBusinessField(String businessField) {
        this.businessField = businessField;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
