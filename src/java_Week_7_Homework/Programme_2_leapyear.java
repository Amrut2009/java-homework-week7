package java_Week_7_Homework;

import java.util.Scanner;

/**
 * Write a java program to input any year like (ex.2007) and find out if it is leap year or not?
 */

public class Programme_2_leapyear {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a year");
        int year =sc.nextInt();
        sc.close();
    }
    public static void leapyear(int year){
        if ((year % 400 ==0) || ((year% 4 ==0) && ( year%100!= 0 ))){
            System.out.println(year + "is a leap year");

        }else{
            System.out.println(year + "is a leap year");
        }
    }

}
