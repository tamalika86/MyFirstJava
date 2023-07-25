package com.MyTest;

import java.text.NumberFormat;
import java.util.Scanner;

public class MyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		
		System.out.println(currency.format(2345));
		Scanner scanner = new Scanner(System.in);
		
		String myText = scanner.nextLine().trim();
		scanner.close();
		System.out.println("....."+myText);
		*/
		//Ternary operater
		int income = 10;
		String elegableCustomer = income > 1000 ? "yes" : "no";
		System.out.println("I am eligable?  :"+elegableCustomer);
		
		Shuffle rf = new Shuffle();
		rf.printMyText();
		int y =rf.x;
	}

}
