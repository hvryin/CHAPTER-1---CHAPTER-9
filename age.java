/**
 *
 * @author hvryn
 */
import java.util.Scanner;
public class age  {
    public void AGE() {
        
        String name;
        int age;
        Scanner qib = new Scanner(System.in);
        boolean continueloop = true;

        while (continueloop) {
            System.out.println("Please enter name:");
            name = qib.nextLine();

            System.out.println("Please enter age:");
            while (!qib.hasNextInt()) {
                System.out.println("Invalid input. Please enter a valid integer for age:");
                qib.next(); 
            }
            age = qib.nextInt();
            qib.nextLine(); 

            System.out.println("Name: " + name);
            System.out.println("Age: " + age);

            System.out.println("Do you want to enter another name and age? (yes/no):");
            String response = qib.nextLine().trim().toLowerCase();

            if (response.equals("yes") || response.equals("y")) {
                continueloop = true;
            } else if (response.equals("no") || response.equals("n")) {
                continueloop = false;
                System.out.println("Exiting the program.");
            } else {
                System.out.println("Invalid response. Exiting the program.");
                continueloop = false;
            }
        }
        qib.close();
    }
}
