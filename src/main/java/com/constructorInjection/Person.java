package com.constructorInjection;

public class Person {
    private Employee employee;

    public Person(Employee employee) {
        this.employee = employee;
    }

    public void displayDetails(){
        System.out.println("Details : " + employee.toString());
    }
}
