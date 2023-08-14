
// giving size of Array and input && output
import java.util.*;

public class L3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Size Of Array");
        int size = sc.nextInt();
        int[] numebr = new int[size];

        // INPUT
        for (int i = 0; i < size; i++) {
            numebr[i] = sc.nextInt();
        }
        // OUTPUT
        for (int i = 0; i < size; i++) {
            System.out.println(numebr[i] + " Printed");
        }
    }
}
