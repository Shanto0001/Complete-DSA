
// 2D Array
import java.util.*;

public class L5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The size of row");
        int row = sc.nextInt();
        System.out.print("Enter The size of colum");
        int colum = sc.nextInt();

        int[][] number = new int[row][colum];

        // input

        // Row Input
        for (int i = 0; i < row; i++) {
            // columns Input
            for (int j = 0; j < colum; j++) {

                number[i][j] = sc.nextInt();
            }

        }

        //OUTPUT
        for(int i =0; i<row; i++){
            for (int j = 0; j < colum; j++) {

                System.out.println(number[i][j]+" ");
            }
        }

    }
}
