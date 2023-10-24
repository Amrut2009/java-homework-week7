package java_Week_7_Homework;

import java.util.Scanner;

/**
 * WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross salary
 * HRA = basic salary 10%
 * DA = Basic salary 8%
 * TA = Basic salary 9%
 * PF= Basic salary 20%
 * Gross salary = basic salary + HRA + TA + DA –PF
 * Print the salary slip
 */

public class programme_5_Salaryslip {
    //declaring the object as static,
    static int empId;
    static String empName ;
    static float basicSalary ;
    static float HRA;
    static float TA;
    static float DA;
    static float PF;
    static float grossSalary;
    //taking input from user in main using Scanner object
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Employee Name");
        empName=sc.next();
        System.out.println("Enter Employee Id");
        empId =sc.nextInt();
        System.out.println("Enter Basic Salary");
        basicSalary =sc.nextFloat();
        calculation();
        priniting();
        sc.close();

    }
    private static void calculation() {
       HRA=((float) 10/100)*basicSalary;
       DA =((float) 8/100)*basicSalary;
       TA=((float) 9/100)*basicSalary;
       PF=((float)20/100)*basicSalary;
       grossSalary =basicSalary +HRA +DA +TA +PF;
    }
    private static void priniting() {
        System.out.println("_____________________________________________________");
        System.out.println("|              SALARY SLIP                           |");
        System.out.println("|____________________________________________________|");
        System.out.println("|Employee Id        :    "+empId+"|");
        System.out.println("|Employee Name      :    "+empName+"|");
        System.out.println("|____________________________________________________|");
        System.out.println("|Basic Salary       :    "+basicSalary+"|");
        System.out.println("|HRA  10%           :    "+HRA+"|");
        System.out.println("|TA    8%           :    " +TA+"|");
        System.out.println("|DA    9%           :    "+DA+"|");
        System.out.println("|PF    20%          :    "+PF+"|");
        System.out.println("|____________________________________________________|");
        System.out.println("|Gross Salary       :    "+grossSalary+"|");
        System.out.println("|====================================================|");
    }
}
