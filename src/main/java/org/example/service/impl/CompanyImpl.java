package org.example.service.impl;

import org.example.models.Company;
import org.example.models.Employee;
import org.example.service.inter.CompanyInter;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class CompanyImpl implements CompanyInter {
    private static List<Company>companyList=new ArrayList<>();

    @Override
    public void addCompany(Company company) {
        companyList.add(company);
        System.out.println(company);
    }

    @Override
    public void hire(Employee employee,String name) {
        Company company1=new Company();

        for (Company company: companyList) {
            if (company.getName().equals(name)){
                company1=company;

            }

        }
       List<Employee>list= company1.getEmployees();
        list.add(employee);
        company1.setEmployees(list);
        System.out.println(employee);

    }

    @Override
    public void hireAll(List<Employee> employeeList,String name) {

        for (Company company:companyList) {
            if (company.getName().equals(name)){
                company.getEmployees().addAll(employeeList);
            }

        }

    }

    @Override
    public List<Company> getAllCompany() {

        return companyList;
    }

    @Override
    public void fire(long id,String companyName) {
        
        for (Company company:companyList) {
            if (company.getName().equals(companyName)){
                EmployeeImpl employee=new EmployeeImpl();
                Employee employee1=employee.getEmployeeById(id,companyName);
                company.getEmployees().remove(employee1);

            }

        }

    }

    @Override
    public List<Employee> getTopSalaryStaff(int count,String cName) {
     Company company1=  companyList.stream().filter(company -> company.getName().equals(cName)).findFirst().get();
       List<Employee> employees=company1.getEmployees();
       Collections.sort(employees);
        Collections.reverse(employees);
       List<Employee>list= employees.stream().limit(count).toList();
       return list;

    }

    @Override
    public List<Employee> getLowestSalaryStaff(int count,String companyName) {
    Company company1=companyList.stream().filter(company -> company.getName().equals(companyName)).findFirst().get();
   List<Employee>employees=company1.getEmployees();

      employees.stream().limit(count).sorted().forEach(employee -> System.out.println(employee) );
   return employees;
    }
}
