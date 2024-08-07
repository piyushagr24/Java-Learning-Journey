package com.example;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args)
    {
        System.out.println("Taking Marks of Subjects...");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Marks of English");
        float eng = sc.nextFloat();
        System.out.println("Enter Marks of Mathematics");
        float math = sc.nextFloat();
        System.out.println("Enter Marks of Physics");
        float phy = sc.nextFloat();
        System.out.println("Enter Marks of Chemistry");
        float chem = sc.nextFloat();
        System.out.println("Enter Marks of PE");
        float PE = sc.nextFloat();
    
        System.out.println("Total Marks Obtained:");
        float sum = eng+math+phy+chem+PE;
        System.out.println(sum);

        System.out.println("Percentage:");
        float per = sum/500;
        float per1 = per*100;
        System.out.println(per1);

        sc.close(); /* not important */
    
    }
}/* why do we have to use float why not int? */
/*The casting of the sum variable to float before performing the division to get the percentage is important in this case.
In Java, when you divide two integers, the result is also an integer. This is because integer division truncates the decimal part of the result. To get a decimal value as the percentage, you need to perform a floating-point division.
By casting the sum variable to float, you're telling Java to perform the division as a floating-point division. This allows you to get a decimal value for the percentage.
float per = (float) sum / 500;*/

/* cgpa ke liye no of subjects *10 se divide karna hai not total marks */
