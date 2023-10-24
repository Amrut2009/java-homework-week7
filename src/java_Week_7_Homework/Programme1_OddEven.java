package java_Week_7_Homework;

import java.util.Scanner;

/**
 * Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */

public class Programme1_OddEven {


    public static void main (String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a number");
        int number= sc.nextInt();

       sc.close();
    }

    public static void EvenOdd(int number){
        boolean ans =(number%2==0 ? true :false);
        if (ans ==true){
            System.out.println(number + "is even number");

        }else{
            System.out.println(number +"is odd number");
        }


    }
}
