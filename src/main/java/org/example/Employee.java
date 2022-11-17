package org.example;

import org.apache.commons.lang3.StringUtils;

public class Employee {
    private String firstName;
    private String lastName;
    private int department;
    private int salary;
    private int id;

    private static int counter = 0;

    public Employee(String firstName, String lastName, int department, int salary) {
        if (!StringUtils.isAlpha(firstName)||!StringUtils.isAlpha(lastName)) {
            throw new IllegalArgumentException("400 Bad Request");
        }
        this.firstName = StringUtils.capitalize(firstName);
        this.lastName = StringUtils.capitalize(lastName);
        this.department = department;
        this.salary = salary;
        this.id = counter++;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getDepartment() {
        return this.department;
    }

    public int getSalary() {
        return this.salary;
    }

    public int getId() {
        return this.id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String toString() {
        return "id-" + id + ": " + firstName + " " + lastName + "; Отдел-" + department + "; З/п-" + salary;
    }


}
