package com.pioneercoders.variousreturntypesandarguments;

class Pen { // class named as Pen
	int Price; // declaring price variable
	String Name; // declaring name variable
}

public class ReturnigClassAndTakingClassReferenceAsArgumentNormalClassEx {
	public static void main(String args[]) {
		Pen P = Pendetails(); // calling Pendetails method and assigning it to Pen Class reference P
		PrintPenDetails(P); // calling PrintPenDetails method by giving argument Pen class reference P

	}

	public static Pen Pendetails() { // Creating Pendetails method which returns Pen Class reference P1
		Pen P1 = new Pen(); // creating object Pen with same class reference
		P1.Price = 10; // assigning value to price
		P1.Name = "SpeedNewRadium"; // assigning Pen Name to Name variable
		return P1; // returning Class reference
	}

	public static void PrintPenDetails(Pen P1) { // method for printing
		System.out.println("The pen Price is: " + "Rs." + P1.Price); // printing pen price
		System.out.println("The Name of Pen is: " + P1.Name); // printing pen name
	}
}