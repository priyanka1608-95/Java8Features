package com.company;

import java.util.Date;

public class Employee
{
    int id;
    String name;
    int salary;
    String dept;
   int yearOfJoining;

    public Employee(int id, String name, int salary, String dept, int yearOfJoining ) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.dept = dept;
        this.yearOfJoining = yearOfJoining;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getJoiningDate() {
        return yearOfJoining;
    }

    public void setJoiningDate(int yearOfJoining) {
        this.yearOfJoining = yearOfJoining;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", dept='" + dept + '\'' +
                ", yearOfJoining=" + yearOfJoining +
                '}';
    }
}
