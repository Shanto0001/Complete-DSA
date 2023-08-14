//Giving input :- size of array and number then we finding the location of number 
import java.util.*;

public class L4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of Array");
        int size = sc.nextInt();
        System.out.println("----------------");

        int[] number = new int[size];

        // input
        System.out.println("Input Number ");
        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();
        }
        System.out.println("----------------");

        // Number You Want To Find (Number.length)
        System.out.print("which location u want to find :-");
        int x = sc.nextInt();
        System.out.println("----------------");

        // OUTPUT
        for (int i = 0; i < number.length; i++) {
            if (number[i] == x) {
                System.out.println("Your number location is:- " + i);
            }
        }

    }
}
