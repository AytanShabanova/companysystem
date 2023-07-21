package org.example.service.inter;

import org.example.models.Company;
import org.example.models.Employee;

import java.util.List;

public interface CompanyInter {
    void addCompany(Company company);

    void hire(Employee employee,String name);


    void hireAll(List<Employee> employeeList,String name);
    List<Company> getAllCompany();


    void fire(long id,String companyName);
    List<Employee> getTopSalaryStaff(int count,String cName);
    public List<Employee> getLowestSalaryStaff(int count,String companyName);


}