package java_Week_7_Homework;

import java.util.Scanner;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 */
public class programme_8_CityName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Letter of City");
        char FirstLetter = sc.next().charAt(0);
        sc.close();

    }

    public static void ifStatement(char Letter) {
        if (Letter == 'A') {
            System.out.println("Ahmedabad");
        } else if (Letter == 'D') {
            System.out.println("Doha");
        } else if (Letter == 'D') {
            System.out.println("Delhi");
        } else if (Letter == 'M') {
            System.out.println("Mumbai");
        } else if (Letter == 'L') {
            System.out.println("London");
        } else {
            System.out.println("Invalid Entry");

        }

    }
}