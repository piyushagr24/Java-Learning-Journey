package com.example;
import java.util.Scanner;
public class ch6_ps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//         System.out.print("Q1");
//         System.out.print("Enter a number:");
//         float num = sc.nextFloat();
// float [] arr = {22.7f ,24.8f , 28f , 30.2f , 31.7f}; /* have to write f or else will be comsidered as double */
// boolean IsInArray = false;
// for(float elements : arr) {
//     if(elements == num) {
//         IsInArray = true;
//         break; // so that java doesnt check all the elements , stops when a match is found
//     }
// }
// if(IsInArray==true) {
//     System.out.println(num + " is present in the array.");
//     }
//     else {
//     System.out.println(num + " is not present in the array.");
//     }
System.out.println("Q4");
int [][] matA = {{1,2,3},
                {4,5,6}};

int [][] matB = {{2,3,4},
                {5,6,7}};
int [][] result = {{0,0,0},
                {0,0,0}};
for (int i =0 ; i<matA.length; i++) {
    for(int j=0 ; j<matA[i].length; j++) {
        result[i][j] = matA[i][j] + matB[i][j];
        System.out.print(result[i][j] + " ");
}
    System.out.println("");
}
    }
}
