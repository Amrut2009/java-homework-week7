package java_Week_7_Homework;

import java.util.Scanner;

/**
 * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or “ZERO”
 */
public class programme_16_PositiveNagativeZero {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number");
        int num =sc.nextInt();
        checknumber(num);
        sc.close();

    }
    static void checknumber(int num){
        if (num >0)
            System.out.println(num + "is positive Number. ");
        else if (num < 0)
            System.out.println(num +"is Negative Number");
        else
            System.out.println(num +"is a Zero");
    }
}
