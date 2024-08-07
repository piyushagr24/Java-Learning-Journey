package com.example;

public class cl10 {
    public static void main(String[] args){
        /* increment & decrement */
        /* check notes , byte+short=int... */

        int i = 7;
        System.out.println(i++); /* yaha pehle i use hoga phir uski value ek se badhegi */

        System.out.println(i); 

        System.out.println(++i); /* yaha pehle uski value ek se badhegi phir i use hoga */
        System.out.println(i); 

        System.out.println(i--); /* yaha pehle i use hoga phir uski value ek se kam hogi */

        System.out.println(i); 

        System.out.println(--i); /* yaha pehle uski value ek se kam hogi phir i use hoga */

        System.out.println(i); 
        /* ye jo bhi badhna ghatna hai vo hamesha ke liye i ke sath hogi mtlb agar mai i=7 kiya hai to in commands ke baad i=8(or 6) ho jaega */

        /* incre aur decre char mai bhi use ho sakta hai, vo jo letter assign kiya hai uske aage ya peeche jaega */
        char j = 'a';
        char z = 'C';
        System.out.println(--j);
        System.out.println(++z);
    }
}
