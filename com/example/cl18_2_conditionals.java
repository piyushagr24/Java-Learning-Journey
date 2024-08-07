package com.example;
import java.util.Scanner;

public class cl18_2_conditionals {
    public static void main(String[] args) {
    
Scanner sc = new Scanner(System.in);
/*System.out.println("Enter Your Age:");
int age = sc.nextInt();
if (age>56){
    System.out.println("You are expert");
}
else if (age>40){
    System.out.println("You are semi-expert");
}
else if (age>30){
    System.out.println("You are average");
}
else {
    System.out.println("You are beginner");
}*/
int age = sc.nextInt();
/* this can be used with anything not only int */
switch (age) {
    case 56:
        System.out.println("You are expert");
        break; /* if break is not present it will match the case and print till next break or till end  */
    case 41:
        System.out.println("You are semi-expert");
        break;
    case 31:
        System.out.println("You are average");
        break;
    default:
        System.out.println("You are beginner");
        break;
}
/* This is enhanced switch */
/*switch (age) {
    case 56 -> System.out.println("You are expert");
    case 41 -> System.out.println("You are semi-expert");
    case 31 -> System.out.println("You are average");
    default -> System.out.println("You are beginner");
}*/

    }
}
