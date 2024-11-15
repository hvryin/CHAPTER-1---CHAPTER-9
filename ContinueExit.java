import java.util.Scanner;

public class ContinueExit {

    public static void main(String[] args) {
        Scanner qib = new Scanner(System.in);
        
        boolean run = true;

        while (run) {
            int even = 0;
            int odd = 0;
            
            //display integer tapi kalau nak end kena type character
            System.out.println("Enter integers. Type a character to end: ");

            while (qib.hasNextInt()) {
                int number = qib.nextInt();
                if (number % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }

            qib.nextLine(); 
            
            // dia akan display number yang kita pilih tu category mana
            System.out.println("Even numbers: " + even);
            System.out.println("Odd numbers: " + odd);

            System.out.print("Do you want to key in another sequence? (yes/no): ");
            String response = qib.nextLine().trim().toLowerCase();
            
               if (!response.equals("yes")) {
                run = false;
            } else {
                System.out.println("Enter a new sequence of integers. Type a non-integer to end the sequence:");
            }           
            
        

        qib.close();
    }}
    
}
