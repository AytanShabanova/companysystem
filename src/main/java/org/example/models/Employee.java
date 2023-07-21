package org.example.models;


import lombok.Data;


@Data



public class Employee implements Comparable<Employee> {
    private  Long id;
    private  int salary;

    public Employee(Long id, int salary) {
        this.id = id;
        this.salary = salary;

    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
       if (this.salary==o.getSalary()){
           return 0;
       }else if (this.salary>o.getSalary()){
           return -1;
       }else {
           return 1;
       }

    }
}



