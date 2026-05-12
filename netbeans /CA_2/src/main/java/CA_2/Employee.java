/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CA_2;

/**
 *
 * @author valeriadionisio
 */
//my diagram 
//Employee
//- employeeId : int {readonly}
//- firstName : String
//- lastName : String
//- gender : String
//- email : String
//- salary : double
//- department : String
//- position : String
//- jobTitle : String
//- company : String

//+ getEmployeeId() : int
//+ getFirstName() : String
//+ getLastName() : String
//+ getFullName() : String
//+ getDepartment() : String
//+ getJobTitle() : String
//+ toString() : String

public class Employee {
    
  //Creating the main Employee class first because all employee types will inherit from this class later.
 //I am adding the common information here (name, email, salary, etc.)
    
    private int employeeId;  //employeeId will later be updated to a final/read-only attribute
    private String firstName;
    private String lastName;
    private String gender;
    private String email;
    private double salary;
    private String department;
    private String position;
    private String jobTitle;
    private String company;
    
    
}
