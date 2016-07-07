package com.cap.demo;

public class MainClass {
	public static void main (String[] args)
	{
		Account acc = new Account();
		acc.deposit();
		greetings();
	}
	
	public static void greetings()
	{
		System.out.println("Hello !");
	}

}
