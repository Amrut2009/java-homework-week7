package java_Week_7_Homework;

import java.util.Objects;
import java.util.Scanner;

/**
 * 10.Write a java program to input any two number and ask user to enter their symbol (+, -, /, *)
 * find addition, Subtraction, multiplication and division according to their symbol (using if else)
 */

public class programme_10 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter First Number:");
        int firstNumber =sc.nextInt();
        System.out.println("Enter Second Number:");
        int SecondNumber = sc.nextInt();
        System.out.println("Enter Operation(+,-,*,/):");
        String operations =sc.next();

        String operation = "";
        operations (firstNumber,operation,SecondNumber);

        sc.close();
    }

    private static void operations(int a,String op,int b) {
        if (Objects.equals(op,"+")) {
            System.out.println("Addition of" + a + "and" + b + "is" + (a + b));
        }else if (Objects.equals(op, "_")) {
            System.out.println("subtraction of " + a + "and" + b + "is" + (a - b));
        }else if (Objects.equals(op,"*")) {
            System.out.println("Multiplication of " + a + "and" + b + "is" + (a * b));
        }else if (Objects.equals(op,"/")) {
            System.out.println("Division of" + a + "and" + b + "is" + (a * b));
        }else{
            System.out.println("Imvalid Operation");

    }




       }
    }





