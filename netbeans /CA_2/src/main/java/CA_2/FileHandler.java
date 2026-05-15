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

    System.out.println("Reading employee file");

}
    
}
