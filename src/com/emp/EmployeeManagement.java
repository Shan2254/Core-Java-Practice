package com.emp;

import java.util.*;




public class EmployeeManagement {
    private static List<Employee> employees = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            displayMenu();
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    acceptEmployeeDetails(sc);
                    break;
                case 2:
                    displayTopEarners();
                    break;
                case 3:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (choice != 3);
        sc.close();
    }
    private static void displayMenu() {
        System.out.println("Select menu option: ");
        System.out.println("1. Accept employee details");
        System.out.println("2. Display top 3 earners");
        System.out.println("3. Exit");
    }
    private static void acceptEmployeeDetails(Scanner scanner) {
        System.out.println("Enter the name: ");
        String name = scanner.next();
        System.out.println("Enter the designation: ");
        String designation = scanner.next();
        System.out.println("Enter the salary: ");
        double salary = scanner.nextDouble();

        employees.add(new Employee(name, designation, salary));
        System.out.println("Employee details accepted");
    }

    private static void displayTopEarners() {
        if(employees.isEmpty()) {
            System.out.println("No employees found");
            return;
        }
        Collections.sort(employees, Comparator.comparingDouble(Employee::getSalary).reversed());
        System.out.println("Top 3 earners in the department are: ");
        System.out.println("Name\tDesignation\tSalary");
        int count = 0;
        for(Employee employee : employees) {
            if(count >= 3) {
                break;
            }
            System.out.format("%s\t%s\t\t%2f%n",employee.getName(), employee.getDesignation(), employee.getSalary());
            count++;
        }
    }

}
