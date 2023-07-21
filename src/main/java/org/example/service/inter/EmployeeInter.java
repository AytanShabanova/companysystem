package org.example.service.inter;

import org.example.models.Employee;

import java.util.List;

public interface EmployeeInter {
  // int getMonthSalary();
    void onFire(int count);
   // void onHire(int count);
    Employee getEmployeeById(long id, String name);
}
