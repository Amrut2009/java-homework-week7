package java_Week_7_Homework;

import java.util.Scanner;

/**
 * Write a program that tells us input value is number or an alphabet or symbol.
 */
public class programme_12_NumberAlphabetSymbol {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter any character :");
        char ch =sc.next().charAt(0);
        checking(ch);
        sc.close();
    }
    private static void checking(char ch) {
        if((ch >='a' && ch <='Z') || (ch >='A' && ch <='Z')) {
            System.out.println(ch + "is a Alphabet");

        } else if(ch >= '0' && ch <= '9') {
            System.out.println(ch + " is a digit");
        } else {
            System.out.println(ch + " is a symbol");



        }
    }

}
