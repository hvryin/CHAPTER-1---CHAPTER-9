/*//non-interactice
public class Factorial {
    public static void main(String[] args) {
        int k = 7; //boleh tukar number
        long factorial = 1;

        for (int i = 1; i <= k; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + k + " is: " + factorial);
    }
}*/


//interactive
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner qib = new Scanner(System.in);
        
        //display suruh select number
        System.out.print("Select number to calculate factorial: ");
        int n = qib.nextInt();
        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + n + " is: " + factorial);
    }
}