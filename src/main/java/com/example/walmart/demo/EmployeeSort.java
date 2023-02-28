package com.example.walmart.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeSort {

    public static void main(String args[]) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("12", "Ram"));
        employeeList.add(new Employee("3", "Sekhar"));
        employeeList.add(new Employee("76", "Pramod"));
        employeeList.add(new Employee("34", "Felix"));
        employeeList.add(new Employee("6", "Dhana"));
        employeeList.add(new Employee("29", "Alex"));
        employeeList.add(new Employee("70", "Vipra"));
        employeeList.add(new Employee("54", "Hemanth"));
        employeeList.add(new Employee("98", "Prem"));
        employeeList.add(new Employee("65", "Xavier"));

        employeeList.stream().sorted((o1,o2) -> o1.getEmpName().compareTo(o2.getEmpName())).filter(setMap -> setMap.getEmpName().startsWith("R")).forEach( emp -> System.out.println("EmpId -> " +emp.getEmpId() +"EmpName ->" + emp.getEmpName()));

        Map<String, String> employeeMap = employeeList.stream().collect(Collectors.toMap((Employee::getEmpId), (Employee::getEmpName)));

        employeeMap.entrySet().stream().forEach(entrySet -> System.out.println("Key is -> " +entrySet.getKey() +" Value is -> " +entrySet.getValue()));
        List<String> emplNameList = employeeMap.entrySet().stream().map(entrySet -> entrySet.getValue()).collect(Collectors.toList());
        System.out.println("Emaplyee Name List is -> " +emplNameList);


    }
}
