package com.company;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main
{

    public static void main(String[] args)
    {
	    List<Employee> employeeList= new ArrayList<>();

	    employeeList.add(new Employee(1,"Priyanka", 40000,"Egov",2020));
        employeeList.add(new Employee(2,"Ritesh",80000,"Telecommunication",2016));
        employeeList.add(new Employee(3,"Yogesh",50000,"HR",2017));
        employeeList.add(new Employee(4,"Prachi",50000,"Egov",2020));
        employeeList.add(new Employee(5,"Vinit",60000,"Telecommunication",2017));
        employeeList.add(new Employee(6,"Aditya",40000,"HR",2016));
        employeeList.add(new Employee(7,"Anushka",35000,"Egov",2016));
        employeeList.add(new Employee(8,"Vedika",70000,"Telecommunication",2020));
        employeeList.add(new Employee(9,"Shreyas",70000,"HR",2015));
        employeeList.add(new Employee(10,"Priya",30000,"Egov",2016));

        System.out.println("Employees having salary greater than 40000 :\n");
        employeeList.stream()
                .filter(e -> e.getSalary() >40000)
                .forEach(System.out::println);

        System.out.println("\nOnly Name of Employees having salary less than or equal to 40000 :\n");
        Map<String, Integer> empNameAndSalary= employeeList.stream()
                .filter(e -> e.getSalary() <= 40000)
                .collect(Collectors.toMap(map -> map.getName(),map->map.getSalary()));

        for(Map.Entry<String,Integer> entry : empNameAndSalary.entrySet())
             System.out.println(entry.getKey() + ":" +entry.getValue());


        System.out.println("\nIncrementing salary of employees having year of joining less than 2017");
        employeeList = employeeList.stream()
                .filter(e->e.getJoiningDate() < 2017)
                .map(incrementSalary).collect(Collectors.toList());

        System.out.println(employeeList.toString());

        System.out.println("sorting employees on basis of their salary :");
        employeeList=employeeList.stream()
                .sorted(Comparator.comparingInt(Employee::getSalary))
                .collect(Collectors.toList());

        System.out.println(employeeList.toString());
    }

    static Function<Employee, Employee> incrementSalary = employee -> {
        employee.setSalary(employee.getSalary() + 10000);
        return employee;
    };
}
