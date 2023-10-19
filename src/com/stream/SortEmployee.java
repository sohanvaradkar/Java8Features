/*
package com.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortEmployee {
    public static void main(String[] args) {
        List<Employee> employees=EmployeeDAO.getEmployee();
       //1st way
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) (o1.getSalary()- o2.getSalary());
            }
        });
        System.out.println(employees.toString());

        //2nd way
        Collections.sort(employees,((o1, o2) -> (int) (o1.getSalary()-o2.getSalary())));
        System.out.println(employees);

        //3rd way
        employees.stream().sorted(((o1, o2) -> (int) (o1.getSalary()-o2.getSalary()))).forEach(System.out::println);

      //4th way
        employees.stream().sorted(Comparator.comparing(Employee::getEmpName)).forEach(System.out::println);


        //5th way
        Collections.sort(employees);
        //asceding order
        Collections.reverse(employees);//reverse order
    }
}
*/
