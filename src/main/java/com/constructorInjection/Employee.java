package com.constructorInjection;

public class Employee {
    private int employeeId;
    private String job;

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getJob() {
        return job;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", job='" + job + '\'' +
                '}';
    }
}
