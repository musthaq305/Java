package org.sample;

public class Employee extends Data{

	//Non parameterized constructor
	public Employee() {
	System.out.println("Non Parameterized Constructor");
	}
	
	//Parameterized Constructor
	public Employee(int age) {
    super(20);
	System.out.println("int Parameterized Constructor");
	System.out.println("Age:"+age);
	}
	
	
	public static void main(String[] args) {
	
	Employee e1= new Employee(22);
	
		
		
	}
	
	
	
	
	
	
}
