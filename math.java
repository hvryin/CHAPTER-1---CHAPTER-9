
import java.util.Scanner;

/**
 *
 * @author hvryn
 */
public class math {
public void qib(){

    Scanner qib = new Scanner (System.in); 

       //display how much sets we want
       System.out.print("How many sets of 3 integers do you want to input?:  ");
        int numiterations = qib.nextInt();
        for (int i = 0; i < numiterations; i++) {
            System.out.println("Set " + (i + 1) + ":");
       init(qib);
               }
    }

    public static void init (Scanner qib) {
        System.out.print("Enter first number: ");
        int num1 = qib.nextInt();
        System.out.print("Enter second number: ");
        int num2 = qib.nextInt();
        System.out.print("Enter third number: ");
        int num3 = qib.nextInt();

     //calculate max and min value out of 3 numbers       
     int min = minimum(num1, num2, num3);       
     int max = maximum(num1, num2, num3);
     
     //display max and min value
     System.out.println("Maximum number is: " + max);
     System.out.println("Minimum number is: " + min);
}

public static int maximum(int x, int y, int z) {
    // to find maximum value
    return Math.max(x, Math.max (y,z) );
}

public static int minimum(int x, int y, int z) {
    //use minimum to find  minimum value
    return Math.min(x, Math.max (y,z) );


}}
