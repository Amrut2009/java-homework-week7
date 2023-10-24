package java_Week_7_Homework;

import java.util.Scanner;

/**
 * find a days in a month by considering leap year or not.
 */
public class programme_4_dayInMonth {

    public static boolean isLeapYear(int year) {
        System.out.println("in-side isLeapYear Method");
        if ((year >= 1 && year <= 9999)) {
            if ((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0)) {
                System.out.println("true");
                return true;
            } else {
                System.out.println("False");
                return false;
            }
        }else{
            System.out.println("false");
            return false;
        }
    }
    public static int GetDaysInMonth(int m, int y){
        System.out.println("In -side  GetDaysInMonth");
        boolean leapyear =isLeapYear(y);
        if ((m>=1 && m<=12) && (y>=1 && y<=9999)) {
            if (leapyear) {
                switch (m) {
                    case 1:
                    case 3:
                    case 7:
                    case 5:
                    case 8:
                    case 10:
                    case 12:
                        return 31;
                    case 2:
                        return 29;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        return 30;
                    default:
                        return 1;
                }
            } else {
                switch (m) {
                    case 1:
                    case 3:
                    case 7:
                    case 5:
                    case 8:
                    case 10:
                    case 12:
                        return 31;
                    case 2:
                        return 29;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        return 30;
                    default:
                        return 1;
                }
            }
        }else{
            return  1;

        }
    }
    public static void main (String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a Year");
        int year =sc.nextInt();
        System.out.println("Enter a month ");
        int month =sc.nextInt();

        boolean a =isLeapYear(year);
        int days =GetDaysInMonth(month,year);
        System.out.println(days);
        sc.close();
    }
}