package com.example;

public class ch24_break_and_cont {
    public static void main(String[] args) {
        /* break statement is used to end the loop irrespective of whether the condition is true or false */
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            if (i == 3) {
                System.out.println("Ending the loop1");
                break;
            }
        }
/* can work even with do while loops */
int k =0;
do { 
    System.out.println(k);
    if (k == 3) {
        System.out.println("Ending the loop2");
        break; /* jaise hi k=3 hoga loop break ho jaega */
    }
    k++;
} while (k<5);

/* continue statement */
for (int j = 1; j <= 5; j++) {
    if (j == 3) {
        System.out.println("Skipping 3");
        continue; /* jaise hi k=3 hoga continue(skip ho jaega loop ke andar ka sab kuch) ho jaega and loop ke next iteration ke liye run karega */
    }
    System.out.println(j);
}


int z = 0;
do {
    z++;
    if(z == 3){
        System.out.println("skipping 3");
        continue; 
    }
    System.out.println(z);
}
while (z<5);
    }
}
