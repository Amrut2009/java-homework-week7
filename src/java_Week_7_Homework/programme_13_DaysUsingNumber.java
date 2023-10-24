package java_Week_7_Homework;

import java.util.Scanner;

/**
 * Write a Java program which input any number between 1 to 7 and it print The Days
 * name MONDAY, TUESDAY.....SUNDAY of the week accordingly by using switch.
 * NOTE: if number is out of selection Print message “Week contains 1 to 7 days”
 */

public class programme_13_DaysUsingNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Valid day number 1 to 7");
            int day = sc.nextInt();
            dayPrint(day);
            sc.close();
    }

    public static void dayPrint(int day){
        switch (day){
            case 1:
                System.out.println("Day" +day+"is a Monday" );
                break;
            case 2:
                System.out.println("Day" +day+"is a Tuesday" );
                break;
            case 3:
                System.out.println("Day" +day+"is a Wednesday" );
                break;
            case 4:
                System.out.println("Day" +day+"is a Thursday" );
                break;
            case 5:
                System.out.println("Day" +day+"is a Friday" );
                break;
            case 6:
                System.out.println("Day" +day+"is a Saturday" );
                break;
            case 7: System.out.println("Day" +day+"is a Sunday" );
                break;
            default:
                System.out.println("Week contains 1 to 7 days ");

        }

    }

}
