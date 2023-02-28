package com.example.walmart.demo;

public class Employee {

    private String empId;
    private String empName;

    public Employee(String emplId, String empName) {
        this.empId = emplId;
        this.empName = empName;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }
}
