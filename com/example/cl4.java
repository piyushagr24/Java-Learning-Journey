package com.example;

public class cl4 {
    public static void main(String[] args) {
        byte age = 34;

        char ch = 'A'; /* char ko comma ke andar hi rakhna hota hai*/

        short s1 = 5; /* short(byte and char) ke liye koi bhi letter nahi hai*/

        float f1 = 5.6f; /*agar f(or F) mention nahi hota to double mante kyuki default vahi hota hai*/

        double d1 = 5.66d; /* agar d(or D) mention nahi bhi hota to koi dikkat nahi thi kyuki default vahi hota hai*/

        long agedino = 222222222l; /* l (or L) is must here coz without that it will be considered as a int , but the value is too big for int */

        boolean bb = true; /* default false hota hai */

        String str = "TBATE"; /* string vale mai double quotes ke andar likhna padta hai */
    
        System.out.println(age);
        System.out.println(ch);
        System.out.println(s1);
        System.out.println(agedino);
        System.out.println(f1);
        System.out.println(d1);
        System.out.println(bb);
        System.out.println(str);
        /* shift+alt+down to mirror the exact code down */
    }
    
}
