package com.stream;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeService {

    public static List<Employee> evaluateTax(String input)
    {
        return (input.equalsIgnoreCase("tax"))?
                EmployeeDAO.getEmployee().stream().filter(emp -> emp.getSalary()>5000.00).collect(Collectors.toList())
                :EmployeeDAO.getEmployee().stream().filter(emp -> emp.getSalary()<=5000.00).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(evaluateTax("tax"));
    }
}
