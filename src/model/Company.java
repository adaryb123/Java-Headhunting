package model;

public class Company {
    String name;
    String businessField;
    int employeesNum;
    String logoFilepath;

    public Company(String name, String businessField, int employeesNum, String logoFilepath) {
        this.name = name;
        this.businessField = businessField;
        this.employeesNum = employeesNum;
        this.logoFilepath = logoFilepath;
    }

    public String getLogoFilepath() {
        return logoFilepath;
    }

    public void setLogoFilepath(String logoFilepath) {
        this.logoFilepath = logoFilepath;
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
