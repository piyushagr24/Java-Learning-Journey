package com.example;

public class ch2_ps {
    public static void main(String[] args) {
    
    //Q1

    float a = 7/4.0f * 9/2.0f ;
    System.out.println(a);
    /* the ans will come 4 because int/int is int and int*int is also int , we have to add .0f on both no to get correct ans.*/

    //Q2

    char grade = 'A';
    grade = (char) (grade + 8);
    System.out.println(grade);

    //now decrypting
    grade = (char) (grade - 8);
    System.out.println(grade);

    //Q3
    

}
}
