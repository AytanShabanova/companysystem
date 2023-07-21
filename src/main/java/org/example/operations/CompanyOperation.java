package org.example.operations;

import org.example.models.Company;

import org.example.models.Employee;
import org.example.models.Operator;
import org.example.service.impl.CompanyImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class CompanyOperation {
    CompanyImpl company=new CompanyImpl();
    Scanner sc=new Scanner(System.in);
    public static  long id;
    public void addCompanyOperatin(){
        List<Employee>list=new ArrayList<>();
        System.out.println("Adi daxil edin");
        String name= sc.next();
        System.out.println("Adres daxil edin");
        String adress=sc.next();
        Company company1=new Company(name,adress,list);
        company.addCompany(company1);
    }
    public void hireOperation(){

        System.out.println("Kompaniya adi qeyd edin");
        String companyName=sc.next();

        for (int i = 0; i <201 ; i++) {
            Random random=new Random();
            int salary=random.nextInt(5000)+1;

            Employee employee=new Operator(id++,salary);
            System.out.println();
            company.hire(employee,companyName);

        }

    }
    public void fireOperation(){
        System.out.println("id nomreni daxil edin");
       long id=sc.nextLong();
        System.out.println("Sirketin adini daxil edin");
        String comPanyName= sc.next();
        Company company1=new Company();
        company1.setName(comPanyName);
        if (company.equals(company1))
        company.fire(id,company1.getName());
    }
    public void gettopsalaryoparetion(){
        System.out.println("say daxil edin");
        int count= sc.nextInt();
        System.out.println("Sirket adi daxil edin");
        String cName=sc.next();
        company.getTopSalaryStaff(count,cName).forEach(System.out::println);
    }
    public void getLowerSalaryOperation(){
        System.out.println("say daxil edin");
        int count=sc.nextInt();
        System.out.println("Sirket adi daxil edin");
        String cName=sc.next();
        company.getLowestSalaryStaff(count,cName);

    }
    public void getAllCompany(){
        company.getAllCompany().stream().forEach(System.out::println);

    }

}
