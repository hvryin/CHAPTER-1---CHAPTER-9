import java.util.Scanner;

public class pssword {
    public static void main(String[] args){
 
        String password = "Pass123456789";
        int maxattempt = 3;
        
        Scanner qib = new Scanner(System.in);
        
        int attempt = 0;
        boolean access = false;
        
        System.out.println("WELCOME TO PASSWORD SYSTEM"); //display welcome
        
        while (attempt < maxattempt) { //if attempt less than maxattempt dia keluar enter password
            System.out.print("Enter password: ");
            String inputPassword = qib.nextLine();
            
            if (inputPassword.equals(password)) { //if password sama dia akan accept
                System.out.println("Password accepted!");
                access = true;
                break; 
            } else { //if attempt password salah dia display incorrect lepastu insert password yang sepatutnya
                attempt++;
                System.out.println("Incorrect. You only have " + (maxattempt - attempt) + " attempt(s) left.");
            }
        }
        
        if (!access) { //if attempt password semua salah dia deny terus
            System.out.println("Denied entry. You have reached the maximum number of attempts.");
        }
        
        
        qib.close();
    }
}
