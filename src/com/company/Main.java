package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {


        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter your name: ");
	    String name = keyboard.nextLine();



        System.out.println("Hello World");
	    System.out.println ("Today is April 17, 2019. I am alive!");
	    System.out.println ("My name is: " + name);
    }
}
