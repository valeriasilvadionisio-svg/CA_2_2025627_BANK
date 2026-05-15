/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CA_2;

/**
 *
 * @author valeriadionisio
 */
import java.util.ArrayList;
import java.util.Scanner;

//This class is responsible only for adding a new employee record.

public class AddHandler  {

    // here to adds a new employee to the employee list
    public void addEmployee(ArrayList<Employee> employeeList, Scanner input) {

        // Clear scanner buffer before reading text
        input.nextLine();

        String firstName;

        // This loop keeps asking until the user enters a valid first name
        do {

        System.out.print("Enter first name: ");
        firstName = input.nextLine();

        // Validation message if the field is empty
        if (firstName.trim().isEmpty()) {

        System.out.println("First name cannot be empty.");
    }

     } while (firstName.trim().isEmpty());
        
         String lastName;

        // This loop keeps asking until the user enters a valid last name
       do {

        System.out.print("Enter last name: ");
        lastName = input.nextLine();

        // Validation message if the field is empty
        if (lastName.trim().isEmpty()) {

        System.out.println("Last name cannot be empty.");
    }

     } while (lastName.trim().isEmpty());

        System.out.print("Enter gender: ");
        String gender = input.nextLine();

        System.out.print("Enter email: ");
        String email = input.nextLine();

        double salary;

       // This loop keeps asking until the user enters a valid salary
       while (true) {

       System.out.print("Enter salary: ");

       // Checking if the value entered is a valid number
       if (input.hasNextDouble()) {

        salary = input.nextDouble();
        input.nextLine();
        break;

    } else {

        // Error message if the salary is not numeric
        System.out.println("Invalid salary. Please enter a number.");

        // Clear invalid input
        input.nextLine();
    }
}

        input.nextLine();

        System.out.print("Enter department: ");
        String department = input.nextLine();

        System.out.print("Enter position: ");
        String position = input.nextLine();

        System.out.print("Enter job title: ");
        String jobTitle = input.nextLine();

        System.out.print("Enter company: ");
        String company = input.nextLine();

        // Creating a simple employee id based on the list size
        int employeeId = employeeList.size() + 1;

        // Creating the new employee object
        Employee newEmployee = new Employee(
                employeeId,
                firstName,
                lastName,
                gender,
                email,
                salary,
                department,
                position,
                jobTitle,
                company
        );

        // Adding the new employee to the list
        employeeList.add(newEmployee);

        System.out.println("Employee added successfully:");
        System.out.println(newEmployee);
    }
}
