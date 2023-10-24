package java_Week_7_Homework;

import java.util.Arrays;

/**
 * write a java programme to sum values of an array
 */
public class programme_18_SumOfArray {
    public static void main(String[] args) {
        int[]numArray={
                1789,2035,1899,787,2040,2255,7897,1455};
        int sum =0;
        for (int i =0; i < numArray.length; i++){
            sum =sum +numArray[i];
            System.out.println("Value of the elements of the array are "+ Arrays.toString(numArray));
            System.out.println("Sum of all the value of the array are" +sum  );



        }
    }
}
