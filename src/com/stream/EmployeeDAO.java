package com.stream;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {

    public static List<Employee> getEmployee()
    {
        List<Employee> employees=new ArrayList<>();
        employees.add(new Employee(12,"Sohan",60000.00));
        employees.add(new Employee(22,"Messi",70000.00));
        employees.add(new Employee(32,"Ronaldo",80000.00));
        employees.add(new Employee(42,"Neymar",90000.00));

        return employees;
    }
}
