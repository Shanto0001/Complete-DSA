
//Revison:- LOOP, User Input, funtion , calculater by using switch case  
import java.util.*;

public class Revision {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First  Number ");
        int a = sc.nextInt();
        System.out.println("Enter Second  Number ");

        int b = sc.nextInt();

        System.out.println("select operator");
        char c = sc.next().charAt(0);

       
        switch (c) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            case '%':
                System.out.println(a % b);
                break;

            default:
                System.out.println("Please Choose Given Command {+,-,*,/,%}");
                break;
        }

    }
}
