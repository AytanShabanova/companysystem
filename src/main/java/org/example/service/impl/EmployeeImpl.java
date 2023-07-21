package org.example.service.impl;

import org.example.models.Company;
import org.example.models.Employee;
import org.example.service.inter.EmployeeInter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeImpl implements EmployeeInter {
    List<Employee>employees=new ArrayList<>();

    @Override
    public void onFire(int count) {
        Company company=new Company();
        for (int i = 0; i <count ; i++) {
            int randomIndex= (int) (Math.random()*company.getEmployees().size());
            Employee employee=company.getEmployees().get(randomIndex);
            company.getEmployees().add(employee);
            company.getEmployees().remove(employee);



        }
    }



    @Override
    public Employee getEmployeeById(long id,String name) {
        for (Employee employee:employees) {
               if (employee.getId().equals(id)){
                   System.out.println(employee);
                   return employee;

               }
        }
        return null;

    }
}
