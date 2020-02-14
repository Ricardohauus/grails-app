package com.schoolofnet

class Person {

	String firstName;
	String lastName;
	int age;

	static constraints = {
		firstName nullable:false,blank:false, unique:true
		age min:15
	}
}
