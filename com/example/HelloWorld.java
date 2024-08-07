package com.example; // Groups classes

public class HelloWorld { // Entrypoint into the application
    public static void main(String[] args) {
        System.out.print("The Sum Of These Numbers is : ");
        int num1=3;
        int num2=4;
        int num3=5;
        int sum=num1+num2+num3;
        System.out.println(sum);
    }
} 
//println mai ek line leave karke aaega bina ln vale mai same line mai aaega
/*neeche vale system mai mai double quotes nahi aaega kyuki double quotes aa jane
ke baad vo string type ban jata hai aur jab ise system vale mai dalte hai to vo use hi print kar deta hai
but neeche vale mai sum as a variable hai jiski value num1..+num3 hai */
