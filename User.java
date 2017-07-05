package com.kish;

public class User {
	  Integer salary;
	  String firstName;
	  String lastName;
	  Integer age;

	  User() {}
	  User(int salary, String first, String last, int age) {
	    this.salary = salary;
	    this.firstName = first;
	    this.lastName = last;
	    this.age = age;
	  }

	  public String toString() {
	    return "" + salary + ", " + firstName + ", " + lastName + ", " + age;
	  }
	}