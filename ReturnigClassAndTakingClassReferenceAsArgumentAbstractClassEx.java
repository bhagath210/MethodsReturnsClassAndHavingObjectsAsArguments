package com.pioneercoders.variousreturntypesandarguments;

abstract class StudentDetails { // abstract class
	int RollNumber;
	String Name;

	abstract void print(); // it is abstract method we can write normal method also
}

class Student extends StudentDetails { // sub class which extends abstract class
	void print() { // implementing the abstract method
		System.out.println("Student details are:");
	}
}

public class ReturnigClassAndTakingClassReferenceAsArgumentAbstractClassEx {
	public static void main(String args[]) {
		Student S = StudentDetails(); // calling the StudentDetails Method and assigning to S
		PrintStudentDetails(S); // calling PrintStudentDetails method by passing reference 'S' as argument
	}

	public static Student StudentDetails() { // Creating Student method which returns Student Class reference 'S'
		Student S = new Student(); // creating object new with same sub class reference S
		S.print();
		S.RollNumber = 210;
		S.Name = "Bhagath Kumar";
		return S; // returning Class reference S
	}

	public static void PrintStudentDetails(Student S) { // printing method taking sub class reference 'S' as argument
		System.out.println("Student's Roll Number is: " + S.RollNumber);
		System.out.println("Student's Name is: " + S.Name);
	}
}