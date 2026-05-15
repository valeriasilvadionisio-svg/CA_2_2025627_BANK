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

//I separated this from FileHandler because FileHandler reads the file, while SearchHandler searches inside the employee list.

public class SearchHandler {
    // This method searches for an employee by full name
    public void searchEmployee(ArrayList<Employee> employeeList, String searchName) {

        // This variable checks if the employee was found
        boolean found = false;

        // Loop through the employee list
        for (Employee employee : employeeList) {

            // Compare the employee full name with the name typed by the user
            if (employee.getFullName().equalsIgnoreCase(searchName)) {

                System.out.println("Employee found:");
                System.out.println(employee);

                found = true;
            }
        }

        // If no employee was found, display this message
        if (!found) {
            System.out.println("Employee not found.");
        }
    }
    
}
