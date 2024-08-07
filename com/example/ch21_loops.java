package com.example;

public class ch21_loops {
    public static void main(String[] args) {
        /* we can do sout for all but loops are better */
System.out.println(1);
System.out.println(2);
System.out.println(3);
System.out.println("Using Loops");
int i = 1;
while (i<=3){
    System.out.println(i);
    i++;/* ab i print hoga phir 1 se  increase ho jaega */
}
/* while(true){
 *   System.out.println("Infinite Loop");
 *  }*/

        /* DO-WHILE LOOP */
    System.out.println("Do-While Loop");
    int j = 1;
    do {
        System.out.println(j);
        j++;
    } while (j<=3);  /* ye pehle loop mai ghusega phir do ke andar wala kaam karega phir check karega ki condittion true hai ki nahi isi liye bhale hi j = 1 ki jagah j=10 hota tab bhi ye 10 to print kar hi deta phir ruk jata  */

        /* FOR LOOP */
        /* for(initialize;check bool expression;update){
         * sout
        } */
        System.out.println("For Loop");
        for (int k = 1; k <= 3; k++) {
            System.out.println(k);
        } /* agar condition starting se hi false hai to loop nahi chalega */
        System.out.println("First 10 odd numbers:");
        int n = 3;
        for (int l = 0; l<n; l++){
            int odd = 2*l + 1;
            System.out.println(odd);
        } /* condition mai sirf l<n ke alawa aur complex expression bhi likh sakte hai bas uska ans true ya false hona chahiye */

    }
}
