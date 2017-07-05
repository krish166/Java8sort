package com.kish;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UserTest {
	  private static List<User> users = Arrays.asList(
	      new User(1000, "Steve", "Vai", 40),
	      new User(4000, "Joe", "Smith", 32),
	      new User(3000, "Steve", "Johnson", 57),
	      new User(9000, "Mike", "Stevens", 18)
	      
	    );

	  public static void main(String[] args) {
	    
	    newJavaWay();
	  }

	

	  private static void newJavaWay() {
	    Collections.sort(users, (User u1, User u2) -> u1.salary.compareTo(u2.salary));
	    printListNewWay("by ID");

	    Collections.sort(users, (User u1, User u2) -> u1.firstName.compareTo(u2.firstName));
	    printListNewWay("by FirstName");

	    Collections.sort(users, (User u1, User u2) -> u1.lastName.compareTo(u2.lastName));
	    printListNewWay("by LastName");

	    Collections.sort(users, (User u1, User u2) -> u1.age.compareTo(u2.age));
	    printListNewWay("by Age");

	  }

	  private static void printListNewWay(String type) {
	    System.out.println("Sorting" + type + ":");

	    users.forEach(u -> System.out.println("\t" + u));

	    System.out.println();
	  }
	}