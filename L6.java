
// Taking Matrix input from user serching value location and print the location 
import java.util.*;

public class L6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int colum = sc.nextInt();

        int[][] number = new int[row][colum];

        for (int i=0; i<row; i++) {

            for (int j = 0; j <colum; j++) {
               number[i][j] = sc.nextInt();

            }
        }
System.out.println("Enter value Which You want to find ");
        int x = sc.nextInt();

        for (int i = 0; i<row; i++) {
            for (int j=0; j <colum; j++) {
                if (number[i][j] == x) {
                    System.out.println("x found at location of (" + i + " , " + j + " ) ");
                }
            }
        }

    }
}