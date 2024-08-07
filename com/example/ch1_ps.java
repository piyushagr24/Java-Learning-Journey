package com.example;
import java.util.Scanner;

public class ch1_ps {
    public static void main(String[] args) {

    //Q3

    System.out.println("What is your name?");
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
    System.out.println( "Hello " + name + ",have a good day!");

    //Q5

    System.out.println("Please enter a number:");
    System.out.println( "Answer is " + sc.hasNextInt());

    sc.close();
}
}