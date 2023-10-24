package java_Week_7_Homework;
/**
 * Write a java program to print the numbers between 1 to 100 which can be divided by 3 and 5 separately.
 */
public class programme_11_DividedBy3And5 {
    public static void main (String[]args){
        dividedby3();
        dividedby5();

    }
    private static void dividedby3() {
        System.out.println("Number divided by 3 between 1 to 100");
        for (int i=1; i<=100; i++){
            if (i %3 ==0);
            System.out.println(i + "");
        }
        System.out.println("/n");
    }
    private static void dividedby5() {
        System.out.println("Number divided by 5 between 1 to 100");
        for (int i=1; i<=100; i++){
            if (i  % 5 ==0);
            System.out.println(i + " ");
        }
        System.out.println("/n");

    }

}
