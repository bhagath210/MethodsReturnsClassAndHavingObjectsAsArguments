package com.pioneercoders.variousreturntypesandarguments;

interface StudentsData { // creating interface
	int Standard = 10;
	abstract void printline();
}

class Students implements StudentsData { // creating sub class which implements interface
	int RegNumber;
	String Name;

	public void printline() { // implementing the abstract method
		System.out.println("The student Data is given below");
	}
}

public interface ReturnigClassAndTakingClassReferenceAsArgumentInterfaceEx {
	public static void main(String args[]) {
		Students S = StudentData(); // calling the StudentData method and assigning to sub class reference 'S'
		PrintDetails(S); // calling PrintDetails method
	}

	public static Students StudentData() { // creating StudentData method 
		Students data = new Students(); // creating object with Student class reference 'data'
		data.printline(); // calling the abstract method
		data.RegNumber = 225;
		data.Name = "Sri Ram";
		return data; // returning the reference of sub class
	}

	public static void PrintDetails(Students S) { // creating PrintDetails method
		System.out.println("Student Reg.Number is: " + S.RegNumber);
		System.out.println("Student's Name is: " + S.Name);
	}
}