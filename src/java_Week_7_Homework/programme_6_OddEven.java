package java_Week_7_Homework;

import java.util.Scanner;

/**
 * Write a java program to input any number and find out if it’s odd or even
 */
public class programme_6_OddEven {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = sc.nextInt();
        isEvenOdd(num);
        sc.close();
    }

    private static void isEvenOdd(int num) {
        if (num % 2 ==0) {
            System.out.println(num + "is Even num");
        }else {
            System.out.println(num +"is Odd num");
        }

    }


}
