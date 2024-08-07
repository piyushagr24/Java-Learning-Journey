package com.example;
import java.util.Scanner;

public class cl13_strings 
/* strings */
{
    public  static void main(String[] args) {
String name = "TBATE";
String nname = "TbATe";
System.out.println("The name is:" + name);
System.out.println("Enter a number");
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
System.out.printf("The value of a is %d.%n", a); /* %n dalne se println jaisa kaam karega mtlb line leave karke output dega */
 /* printf ki jagah "format" bhi use kar sakte hai same result dega */
int value = name.length();
System.out.println(value);
String lwrstring = nname.toLowerCase();
System.out.println(lwrstring);
String uprstring = nname.toUpperCase();
System.out.println(uprstring);
/* inki jagah ham directly sout(name.toLowerCase) */
String nontrim = "   TBATE   ";
System.out.println(nontrim);
System.out.println(nontrim.trim()); /*isse without any spaces aaega */
/* for substring T(0)B(1)A(2)T(3)E(4) */
System.out.println(name.substring(2)); /* 2 se leke end tak aaega , 0 dalne se koi mtlb nahu isse acha direct sout karo */
System.out.println(name.substring(2,5)); /* 2 se leke 4 tak aaega , end index ko output me nahi lata uske ek no pehle tak lata hai (here 4) */
System.out.println(name.replace('T' , 'S')); /* NOTE yaha single quotes hai , yaha pe jo char pehle dala vo sare baad vale char se replace ho jata hai */
System.out.println(name.replace("TBA" , "STA")); /* multiple char ko bhi replace kar sakte hai */ /* NOTE yaha double quotes use hota hai */
System.out.println(name.replace("T" , "STA"));/* yaha pe first char me sirf T hota to pure word me sare T ko replace karta (can also do name.replaceAll) */
System.out.println(name.startsWith("TBA"));/* agar TBA se start hai to true print karega varna false*/
System.out.println(name.endsWith("TBA"));/* agar TE se end hai to true print karega varna false*/
System.out.println(name.charAt(0)); /* give output as the char present in substring 2 */
System.out.println(name.indexOf("T")); /*prints first occurance of T , here T occurs in 0 as well as in 3 but first is 0 */
/* will output -1 if no match is found */
System.out.println(name.indexOf("TE"));/* will print the substring form which it starts  */
System.out.println(name.indexOf("T" , 2));/*now it will start searching from 2 so even if  T comes in 0 first it will output 3 since searching is from 2 */System.out.println(name.lastIndexOf("T")); /* prints last occurance of T here 3  */
System.out.println(name.lastIndexOf("T" , 2 )); /* isme ye end se search karta hai isi liye agar koi limit lagao to vaha se start tak search karega */
System.out.println(name.equals("tbate"));/* will check whether the name(TBATE) is equal to given name(tbate) here false */
System.out.println(name.equalsIgnoreCase("tbate"));/* ab true hoga kyuki ab bas letters dekhega ot cases too */

/*escape sequence */ /* see oracle website */
System.out.println("escape sequence\nnew line");
System.out.println("escape sequence\\backslash");
System.out.println("escape sequence\'single quote");
System.out.println("escape sequence\"double quotes");
/* NOTE: backslash \ use hua hai */

System.out.println("Enter a decimal no");
float b1 = sc.nextFloat();
System.out.printf("The value of b1 is %f.", b1);/*how to make exact input print */
System.out.printf("The value of b1 is %.2f.", b1); /* sirf 2 decmal tak print hoga */
System.out.printf("The value of b1 is %8.2f.", b1); /* is ke baad 8 space tak result print hoga */
    }
    
}
