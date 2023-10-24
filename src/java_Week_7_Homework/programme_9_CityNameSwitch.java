package java_Week_7_Homework;

import java.util.Scanner;

/**
 *  * Input any alphabet from “A" to “F” and print their city name accordingly (use switch statement) if
 *  * any other alphabet should be invalid entry
 *
 */

public class programme_9_CityNameSwitch {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter First Letter of City");
        char FirstLetter =sc.next().charAt(0);
        switchstatement (FirstLetter);
        sc.close();
    }
    private static void switchstatement(char firstLetter) {
        switch (firstLetter){
            case 'A':
                System.out.println("Ahmedabad");
                break;
            case 'D':
                System.out.println("Delhi");
                break;
            case 'L':
                System.out.println("London");
                break;
            case'd':
                System.out.println("doha");
                break;
            case 'M':
                System.out.println("Mumbai");
                break;
            default:
                System.out.println("Invalid Entry");
        }
    }
}
