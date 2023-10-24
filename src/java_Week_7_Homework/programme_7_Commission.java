package java_Week_7_Homework;

import java.util.Scanner;

/**
 * Write a java program input sales id, seller's name, sales amount, and salary basic and then fined this sales Commission
 * Sales amount >= 50,000 35%
 * Sales amount >= 30,000 20%
 * Sales amount >= 20,000 10%
 * Sales amount >= 10,000 5%
 * Sales amount < 10,000 2%
 */
public class programme_7_Commission {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Sales Id");
        int SalesId  =sc.nextInt();
        System.out.println("enter Seller's Name");
        String SellerName =sc.next();
        System.out.println("Enter Sales Amount");
        float salesAmount =sc.nextFloat();
        System.out.println("Enter Sales Basic Salary");
        float basicSalary =sc.nextFloat();
        System.out.println("Commission + commission");
        float commission =sc.nextFloat();
        sc.close();
    }
    public static float commission (float salesAmount) {
        float commission = 0;
        if (salesAmount >= 50_000) {
            commission = ((float) 35 / 100) * salesAmount;
        }else if
            (salesAmount>=30_000 && salesAmount<=49_000){
           commission=((float) 20/100)* salesAmount;
        } else if
        (salesAmount>=20_000 && salesAmount <=29_999) {
            commission =((float) 10/100)* salesAmount;
        } else if (salesAmount>=10_000 && salesAmount <=19_999) {
            commission=((float) 5/100)*salesAmount;
        } else if (salesAmount>=0 && salesAmount<=9_999) {
            commission=((float) 2/100)*salesAmount;
        }else System.out.println("no Commission");
        return commission;


    }
    }

