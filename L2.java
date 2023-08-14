// Printing number of array by using LOOP && finding sum of marks

import java.util.*;

public class L2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[5];

        System.out.println("Enter Your Maths Marks");
        array[0] = sc.nextInt();

        System.out.println("Enter Your Phy Marks");
        array[1] = sc.nextInt();

        System.out.println("Enter Your chem Marks");
        array[2] = sc.nextInt();

        System.out.println("Enter Your eng Marks");
        array[3] = sc.nextInt();

        System.out.println("Enter Your phython Marks");
        array[4] = sc.nextInt();

        for (int i = 0; i < 5; i++) {
            System.out.println(array[i]);

        }

        int sum = array[0] + array[1] + array[2] + array[3] + array[4];
        System.out.println("Total Marks:- " + sum + "/500");

    }
}