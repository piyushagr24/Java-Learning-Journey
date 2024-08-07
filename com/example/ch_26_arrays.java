package com.example;

public class ch_26_arrays {
    public static void main(String[] args) {
        /* arrays are collection of similar types of data  */
        /* ex: to store marks of 5 students one can make 500 variables or an array of 5 objects  */
int[] marks = new int[5];
/* we can make array of float and string as well */
marks[0] =55;
marks[1] =46;
marks[2] =28;
marks[3] =77;
marks[4] =39;
/* we can also do int[]marks = {55,46,28,77,39} 
 * no need to enter size , java will know on its own
*/
/* or we can do
 * int[] marks;
 * marks = new int[5];
 */
System.out.println(marks[4]);
System.out.println(marks.length); /* to know the length of array */

/* to print the values of array we can either write all the index or use for loop */
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        for (int element : marks){
            System.out.println(element);
        }
        /* making a multidimentional array (array ke andar array) */
        int flats[][] = new int [2][3]; /* 2rows 3 coloumns */
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;
        for (int[] flat : flats) {
            for (int j = 0; j < flat.length; j++) {
                System.out.print(flat[j]);
                System.out.print("\t");
            }
            System.out.println("");
        }
    // for (int i = 0; i < flats.length; i++) {
    //     for (int j = 0; j < flats[i].length; j++) {
    //      System.out.print(flats[i][j]);
    //             System.out.print("\t");
    //         } 
    //     System.out.println("");
    //     }
    }
}
