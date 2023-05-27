package org.sample;

public class Data {

	public Data() {
    System.out.println("Parent Non Parameterized Constructor");
	}
	
	public Data(int pin) {
	 System.out.println("Parent int Parameterized Constructor");
	 System.out.println("Pin:"+pin);
	}
}
