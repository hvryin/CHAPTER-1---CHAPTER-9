import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner qib = new Scanner(System.in);

        int maxnum;
        
        System.out.print("Enter the max number for Fibonacci: "); //display input
        maxnum = qib.nextInt();

        if (maxnum < 0) { //kalau bawah 0 dia display ni
            System.out.println("Enter a positive number.");
        } else {
            System.out.println("Fibonacci series up to " + maxnum + ":");
            
            int a = 0, b = 1;
            
            System.out.print(a); //dia print first number
            if (maxnum > 0) {
                System.out.print(", " + b); // dia print second number
            }
            
            int then; 
            
            while (true) {
             then = a + b;
                if (then > maxnum) {
                    break;
                }
                System.out.print(", " + then);
                
                a = b;
                b = then;
            }
            
            System.out.println();
        }

        qib.close();
    }}

