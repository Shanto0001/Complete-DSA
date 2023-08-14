// Basic Array Code 
import java.util.*;

public class L1 {
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

        System.out.println(array[0] + "  Your Maths Marks");

        System.out.println(array[1] + "  Your Phy Marks");

        System.out.println(array[2] + "  Your Chem Marks");

        System.out.println(array[3] + "  Your eng Marks");

        System.out.println(array[4] + "  Your Python Marks");

    }
}
