package ABSTRACTCLASS;

abstract class Info { //if required we can extends for child class.

    private String company_Name;
    private String dept_Company;
    private int employee;

    abstract void info_Company();
    abstract int age_Company();

    private Info(String company_Name, String dept_Company, int employee) {
        this.company_Name = company_Name;
        this.dept_Company = dept_Company;
        this.employee = employee;
    }

    public String getCompany_Name() {
        return company_Name;
    }

    public void setCompany_Name(String company_Name) {
        this.company_Name = company_Name;
    }

    public String getDept_Company() {
        return dept_Company;
    }

    public void setDept_Company(String dept_Company) {
        this.dept_Company = dept_Company;
    }

    public int getEmployee() {
        return employee;
    }

    public void setEmployee(int employee) {
        this.employee = employee;
    }
}
