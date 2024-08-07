package com.example;
import java.util.Scanner;

public class ch4_ps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
//Q1
// will not work because a=11 cant be there its assingment not equals to operator

/*System.out.println("Q2");
System.out.println("Enter marks of Maths ");
int m1 = sc.nextInt();
System.out.println("Enter marks of Chemistry");
int m2 = sc.nextInt();
System.out.println("Enter marks of Physics");
int m3 = sc.nextInt();
float per = (m1 + m2 + m3)/3.0f;
if (per <= 40){
    System.out.println("Failed!!");
    System.out.println("Your percentage: " + per);
}
else if (m1 <=33 || m2<=33 || m3 <= 33)
    System.out.println("Failed in Maths, Chemistry, or Physics");
else {
    System.out.println("Passed with " + per);
}*/

/*System.out.println("Q3");
float tax;
System.out.println("Enter your income");
float inc = sc.nextFloat();
if (inc<250000){
    tax = 0;
    System.out.println("Your tax is:"+ tax);
}
else if (inc>250000 && inc<500000){
    tax =(inc - 250000)*0.05f;
    System.out.println("Your tax is:"+ tax);
}
else if (inc>500000 && inc<100000){
    tax =(inc - 250000)*0.20f;
    System.out.println("Your tax is:"+ tax);
}
else {
    tax =(inc - 250000)*0.30f;
    System.out.println("Your tax is:"+ tax);
}*/


/*     PROBLEM   */

/*System.out.println("Q4");
System.out.println("Enter the date");
    int dd = sc.nextInt();
Switch (dd) {
    case 0:
        System.out.println("Sunday");
        break;
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
    case 4:
        System.out.println("Thursday");
        break;
    case 5:
        System.out.println("Friday");
        break;
    case 6:
        System.out.println("Saturday");
        break;
    default:
        System.out.println("Invalid Date");
        break;
}*/
System.out.println("Q5");
System.out.println("Enter the year");
int year = sc.nextInt();

if (year % 400 == 0) {
    System.out.println("Year is a leap year");
}/* %100 and % 400 are special cases for century cases */
else if (year % 100 != 0 && year % 4==0) {
    System.out.println("Year is a leap year");
}
else {
    System.out.println("Year is not a leap year");
}

/*System.out.println("Q6");
System.out.print("Enter website link:");
String web = sc.next();
if (web.endsWith(".org")){
    System.out.println("Organization website");
}
else if(web.endsWith(".com")){
    System.out.println("Commercial website");
}
else if(web.endsWith(".in")){
    System.out.println("Indian website");
}*/
//switch (link) {


}
}
