package com.example;

public class cl8 {
    public static void main(String[] args) {

        int a = 4;
        int b = 6 % a; /* gives output as remainder of 6/4 , can work even with decimals */ /* module operator */
        System.out.println(b);

        int c = 9;
        c = c+3; /* gives output as c+3 */ /* can also do c+=3 */
        System.out.println(c);

        System.out.println(6==4); /* will print true if the statment is correct and false if wrong */

        System.out.println(64>5 && 64<90); /* && stands for and , will print true if both are correct else false */    

        System.out.println(64>5 || 64<90 ); /* || stands for or , will print true even if either is true */
    }
}
