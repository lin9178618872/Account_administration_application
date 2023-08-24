package Name_pack;

import java.util.Random;
import java.util.Scanner;

public class Name {
	 private String first_name;
	 private String last_name;
	 private String password;
	 private String department;
	 private String name;
	 private int TaskCapacity = 10;
	 private int LengthofPassword = 7;
	 
	 // constructor to first name last name
	  public Name(String firstName, String lastName) {
		  this.first_name = firstName;
		  this.last_name = lastName;
	      this.department = setDepartment();
	      this.password = randomPassword(LengthofPassword);
	      System.out.println("Your password is: " + this.password);
	      name = firstName.toLowerCase() + "_" + lastName.toLowerCase() + "_" + department;
	  }

	  private String setDepartment() {
		    System.out.println("New employee: " + first_name + ". + Department Codes:\n1 for Research&Developement\n2 for Sales&Marketing\n3 for Customer Support\n0 for else\nEnter department code: ");
		    Scanner in = new Scanner(System.in);
		    int depChoice = in.nextInt();

		    switch (depChoice) {
		        case 1:
		            return "Research&Development";
		        case 2:
		            return "Sales&Marketing";
		        case 3:
		            return "Customer_Support";
		        default:
		            return "";
		    }
		}


	  private String randomPassword(int length) {
		    String passwordGroup = "ABCDEFGHIJK!@#./%1234567890";
		    char[] password = new char[length];
		    Random random = new Random();

		    int i = 0;
		    while (i < length) {
		        int rand = random.nextInt(passwordGroup.length());
		        password[i] = passwordGroup.charAt(rand);
		        i++;
		    }


		    return new String(password);
		}

	 
	 //set method for define the property
	 // set the task capacity
	 public void TaskCapacity(int capacity) {
		 this.TaskCapacity = capacity; 
	 }
	 

	 // renew the password
	 public void NewPassword(String password) {
		 this.password = password;
	 }
	 
	 // define the property
	 public int gettaskCapacity() { return TaskCapacity; }
	 public String getPassword() { return password; }
	 
	 public String showInfo() {
		 return "Account NAME: " +name+
	            "\nTask CAPACITY:" + TaskCapacity + " items ";
	 }
}