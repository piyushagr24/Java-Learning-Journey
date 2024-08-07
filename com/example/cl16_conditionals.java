package com.example;
import java.util.Scanner;
public class cl16_conditionals {
    
public static void main(String[] args) {
    System.out.println("What is your age?");
    Scanner sc = new Scanner(System.in);
int age = sc.nextInt();
    
    if(age >= 18) /* this is greater han or equal to */ {
    System.out.println("You are an adult!");
    } /* we can also use only if statement  */
    else{
    System.out.println("You are a child!");
    }
/* && and , || or , ! not */
System.out.println("Enter value of a");
boolean a = sc.nextBoolean();
System.out.println("Enter value of b");
boolean b = sc.nextBoolean();

System.out.println("For AND...");
if (a && b)
    System.out.println("Both conditions are true");
else { 
    System.out.println("one condition is false");
}
System.out.println("For OR...");
if (a || b)
    System.out.println("one condition is true");
else { 
    System.out.println("Both conditions are false");
}
System.out.println("For NOT...");
System.out.print("not-a is:");
System.out.println(!a);
System.out.print("not-b is:");
System.out.println(!b);


    }
}
