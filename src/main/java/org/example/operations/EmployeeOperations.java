package org.example.operations;

import org.example.service.impl.EmployeeImpl;

import java.util.Scanner;

public class EmployeeOperations {
    Scanner sc=new Scanner(System.in);
    EmployeeImpl employee=new EmployeeImpl();
    public void onFireOperation(){
        System.out.println("nece isci cixarmaq isteyirsiz sayi qeyd edn");
        int count=sc.nextInt();
        employee.onFire(count);

    }
    public void getEmployeeOperation(){
        System.out.println("Iscinin id nomresini  daxil edin");
       long id=sc.nextLong();

        System.out.println("Sirketin adini daxil edin");
        String name= sc.next();
    employee.getEmployeeById(id,name);}
}
