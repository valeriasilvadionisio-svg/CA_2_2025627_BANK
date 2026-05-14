/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package CA_2;

/**
 * @author valeriadionisio
 */
//CA2 Integrated Project - I chosed Bank Organisation 
// The program will allow the user to:
//read employee/applicant records from a file;
//sort records alphabetically;
//search for a person and show their manager type and department;
//add new employee records with input validation;
//create an employee hierarchy using a binary tree.
//The system will use the package name CA_2 as required in the assignment brief.

import java.util.Scanner;

//This class will starts the system and displays the menu options.

//For now, I am creating the console menu structure first later, each menu option will call a method, such as reading the file,
//sorting records, searching employees, adding records and creating the binary tree.

public class CA_2 {

   
    public static void main(String[] args) {

        // Scanner used to read user input
        Scanner input = new Scanner(System.in);

        // This variable stores the number chosen by the user from the menu
        int choice;

        // here the loop keeps showing the menu until the user chooses option 6 to exit
        do {

            System.out.println("\n===== BANK SYSTEM =====");
            System.out.println("1. READ FILE");
            System.out.println("2. SORT");
            System.out.println("3. SEARCH");
            System.out.println("4. ADD RECORD");
            System.out.println("5. CREATE BINARY TREE");
            System.out.println("6. EXIT");

            // Ask for user input
            System.out.print("Select an option: ");
            choice = input.nextInt();

            // The switch its to checks which option the user selected
            switch (choice) {

                case 1: //If the user choose 1, the program will later read the employee file
                    System.out.println("READ FILE selected.");
                    break;

                case 2: //same here 
                    System.out.println("SORT selected.");
                    break;

                case 3: //same here 
                    System.out.println("SEARCH selected.");
                    break;

                case 4://same here 
                    System.out.println("ADD RECORD selected.");
                    break;

                case 5: //same here
                    System.out.println("CREATE BINARY TREE selected.");
                    break;

                case 6: //same here
                    System.out.println("Exiting system...");
                    break;

                default: //if the user types any number outside 1-6, this message is displayed
                    System.out.println("Invalid option. Please try again.");
            }

        } while (choice != 6); // The loop continues while the user has not selected option 6

        // here is to closing the Scanner after the loop ends
        input.close();
    }

    }
