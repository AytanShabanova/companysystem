package org.example.operations;

import org.example.models.Company;

import java.util.Scanner;

public class MainOperation {
    public static void main(String[] args) {


        new MainOperation().start();
    }

    public void start() {

        CompanyOperation companyOperation = new CompanyOperation();
        EmployeeOperations employeeOperations = new EmployeeOperations();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Sirket tenzimlemeri ucun 1 \n" +
                    " isci kimi daxil olmaq ucun 2 \n secin");
            int count = sc.nextInt();
            if (count == 1) {
                System.out.println("Sirket elave etmek ucun 1 \n " +
                        " Isci elave etmek ucun 2 \n " +
                        "Isci silmek ucun 3 \n" +
                        " En cox maas alanlari getirmek ucun 4 \n" +
                        " En az maas alanlari getirmek ucun 5 \n" +
                        "Sirketvmelumatlarini getirmek ucun  6 \n secin");
                count = sc.nextInt();

                switch (count) {
                    case 1:
                        companyOperation.addCompanyOperatin();
                        break;
                    case 2:
                        companyOperation.hireOperation();
                        break;
                    case 3:
                        companyOperation.fireOperation();
                        break;
                    case 4:
                        companyOperation.gettopsalaryoparetion();
                        break;
                    case 5:
                        companyOperation.getLowerSalaryOperation();
                        break;
                    case 6:companyOperation.getAllCompany();
                }

            } else if (count == 2) {
                System.out.println("Iscinin melumatlarini ekrana getirmek ucun 1 \n " +
                        "Iscini silmek ucun 2 \n daxil edin");
                count = sc.nextInt();
                switch (count) {
                    case 1:
                        employeeOperations.getEmployeeOperation();
                        break;
                    case 2:
                        employeeOperations.onFireOperation();
                        break;

                }

            }


        }

    }
}