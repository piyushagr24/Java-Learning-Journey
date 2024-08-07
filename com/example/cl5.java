package com.example;
import java.util.Scanner;

public class cl5 {
    public static void main(String[] args) 

    {

    System.out.println("Taking Input From the User");
    Scanner sc = new Scanner(System.in);/* system.in ka mtlb keyboard ka input le rahe hai */
    System.out.println("Enter Number 1");
    int a = sc.nextInt();
    System.out.println("Enter Number 2");    
    int b = sc.nextInt();
    int sum = a+b;
    System.out.println("The sum of these numbers is:");
    System.out.println(sum);

    System.out.println("Enter an integer");
    boolean b1 = sc.hasNextInt();/* iska mtlb agat intger ke range ki value daloge to true bolega varna false bolega */
    sc.nextLine();
    System.out.println(b1);
/*The issue you're experiencing is due to the fact that the nextLine() method is consuming the newline character that was left in the input stream after the hasNextInt() method was called.To fix this issue, you can add an extra nextLine() call before the code that reads the string input. This will consume the newline character left in the input stream after the hasNextInt() method */

    sc.nextLine(); /* ise bhi add karna padega varna vo abhi bhi boolean ka hi input dega */

    System.out.println("Enter a word");
    String str1 = sc.next();/* sirf next likhenge to line ka sirf first word hi lega nextLine me pura line lega */
    System.out.println(str1);

    sc.nextLine();/* ye dubara add karna padega varna vo upar vale input ka bachi hui line print kar dega */

    System.out.println("Enter a line");
    String str2 = sc.nextLine();
    System.out.println(str2);
    
    }
}
    /*after we stored the value in the word and we pressed enter, the extra change in line was buffered as input and when the nextLine() method started searching for its input, it gets the extra change in line in buffer, and just because there is no character before the extra change in line, the nextLine() method stores the blank value in the variable and prints a blank space.
     * To fix the above example's issue, we usually add an extra nextLine() method just before the nextLine() method whose value we are storing, by this the extra nextLine() will absorb the extra change in line
     */