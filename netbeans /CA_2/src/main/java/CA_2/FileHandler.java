/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CA_2;

/**
 *
 * @author valeriadionisio
 */

import java.util.ArrayList; //An ArrayList is useful because its size can grow automatically as new employee records are added. 
//This is better than using a normal array with a fixed size, because the program may need to store more employees later.

import java.io.File; //to opem file
import java.io.FileNotFoundException; //to correct the error if the file not exist 
import java.util.Scanner; //read line by line 

//This class will be responsible for reading employee records from the file.
// I am keeping this separate from CA_2 because CA_2 is the main class and should focus on running the menu.
//FileHandler will focus only on file related tasks.



//FileHandler is the class name. The constructor has the same name as the class and it is used to prepare the object when it is created. 
//In this case, the constructor creates an empty ArrayList to store employee records later.

public class FileHandler {
    // This list will store the employee records read from the file
    private ArrayList<Employee> employeeList;
    
    //this constructor creates the ArrayList that will store employee records
     public FileHandler() {

        // Creating the ArrayList object
        employeeList = new ArrayList<>();
        }
     
      //This method will later read employee records from the file.
      //now  I am only creating the method structure first before adding the full file reading logic.
     
     
     
     
     
     
     public void readFile() {

    // Try-catch i used to avoid the program crashing if the file does not exist
    try {

    // to creating the File object
    File employeeFile = new File("Applicants_Form - Sample data file for read.txt"); //the same name is in the file, so the "read file" can open 

    // Scanner used to read the file
    Scanner fileReader = new Scanner(employeeFile);

    System.out.println("File opened successfully.");
    
    
   //-----------------------------------------------------//

//in this part the code will read the file / read line by line/ show in the terminal / count how many lines exists

    
    // Variable used to count how many records were read from the file
    int recordCount = 0;

    // This loop reads the file line by line until there are no more lines
    while (fileReader.hasNextLine()) {

    // Storing one line from the file into a String variable
    String line = fileReader.nextLine();

    // Displaying the line in the console
    System.out.println(line);

    // Increasing the counter each time a new line is read
    recordCount++;
}

    // show the total number of records read
    System.out.println("Total records loaded: " + recordCount);
    
 
    // Closing the Scanner after reading the file
    fileReader.close();

} catch (FileNotFoundException e) {

    // Error message if the file cannot be found
    System.out.println("File not found.");

}

}
    
}
