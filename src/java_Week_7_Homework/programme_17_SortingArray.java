package java_Week_7_Homework;

import java.util.Arrays;

/**
 * Write a Java program to sort a numeric array and a string array.
 */
public class programme_17_SortingArray {
    public static void main(String[] args) {
        int[] numArrays ={
                1789,2035,1899,2040,1950,2255,7897,1455,787};
        String[] strArrays ={
                "Alpha", "Bravo", "Delta", "Hotel", "Mike", "Sierra", "Peter", "Kilo"};
        Arrays.sort(numArrays);
        System.out.println("Sorted Numerical Array is" +Arrays.toString(numArrays));
        System.out.println(" ");
        System.out.println("Actual String Arrays was "+ Arrays.toString(strArrays));
        Arrays.sort(strArrays);
        System.out.println("Sorted String Array is " + Arrays.toString(strArrays ));


        }
    }


