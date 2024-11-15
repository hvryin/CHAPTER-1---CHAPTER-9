/*import java.util.Scanner;

public class Choosethree {

    public static void main(String[] args) {
        Scanner qib = new Scanner(System.in);
        boolean run = true;

        while (run) {
            String password = "Pass123456789";
            int maxattempt = 3;
            int attempt = 0;
            boolean access = false;

            System.out.println("WELCOME TO PASSWORD SYSTEM");

            
            while (attempt < maxattempt) {
                System.out.print("Key in password: ");
                String inputPassword = qib.nextLine();
                
                // ni display kalau password tu accepted
                if (inputPassword.equals(password)) {
                    System.out.println("Password accepted!");
                    access = true;
                    break;
                } else { // ni display kalau password salah
                    attempt++;
                    System.out.println("Incorrect. You only have " + (maxattempt - attempt) + " attempt(s) left.");
                }
            }

            if (!access) {
                System.out.println("Denied entry. You have reached the maximum number of attempts.");
            }

            //tanya user nak continue ke tak
            System.out.println("Choose an option:");
            System.out.println("1. Try again, put new password");
            System.out.println("2. Exit the program");

            
            boolean choice = false;
            while (!choice) {
                System.out.print("Enter your choice (1 for integer input, 2 for character input, or 3 for string input): ");
                String userChoice = qib.nextLine().trim().toLowerCase();

                switch (userChoice) {
                    case "1":
                        //integer
                        System.out.print("Enter 1 to continue or 2 to exit: ");
                        int intChoice = qib.nextInt();
                        qib.nextLine(); 
                        if (intChoice == 1) {
                            choice = true;
                        } else if (intChoice == 2) {
                            run = false;
                            choice = true;
                        } else {
                            System.out.println("Invalid. Please enter 1 or 2.");
                        }
                        break;

                    case "2":
                        //character
                        System.out.print("Enter 'c' to continue or 'e' to exit: ");
                        char charChoice = qib.nextLine().trim().toLowerCase().charAt(0);
                        if (charChoice == 'c') {
                            choice = true;
                        } else if (charChoice == 'e') {
                            run = false;
                            choice = true;
                        } else {
                            System.out.println("Invalid choice. Please enter 'c' or 'e'.");
                        }
                        break;

                    case "3":
                        //string 
                        System.out.print("Enter 'continue' to continue or 'exit' to exit: ");
                        String strChoice = qib.nextLine().trim().toLowerCase();
                        if (strChoice.equals("continue")) {
                            choice = true;
                        } else if (strChoice.equals("exit")) {
                            run = false;
                            choice = true;
                        } else {
                            System.out.println("Invalid. Please enter 'continue' or 'exit'.");
                        }
                        break;

                    default:
                        System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                        break;
                }
            }
        }

        System.out.println("Program terminated.");
        qib.close();
    }
}*/

/*import java.util.Scanner;

public class Choosethree {

    public static void main(String[] args) {
        Scanner qib = new Scanner(System.in);
        boolean run = true;

        while (run) {
            //input num students
            System.out.print("Enter number of students: ");
            int numstu = qib.nextInt();

            if (numstu <= 0) { //student kena lebih dari 0
                System.out.println("Number of students must be greater than 0.");
                continue;
            }

            int pass = 0;

            //input result
            for (int i = 0; i < numstu; i++) {
                System.out.print("Enter result for student " + (i + 1) + " (1 for pass, 0 for fail): ");
                int result = qib.nextInt();

                if (result == 1) {
                    pass++;
                }
            }

            int fail = numstu - pass;

            //result display berapa pass and berapa fail
            System.out.println("Students who passed: " + pass);
            System.out.println("Students who failed: " + fail);

            if (pass > numstu / 2) {
                System.out.println("Bonus to instructor");
            }

            // bagi user option
            boolean choice = false;
            while (!choice) {
                System.out.println("Choose an option to continue:");
                System.out.println("1. Continue with a new set of students (integer input)");
                System.out.println("2. Continue with a new set of students (character input)");
                System.out.println("3. Exit the program (string input)");

                System.out.print("Enter your choice: ");
                String pick = qib.next().trim().toLowerCase();

                switch (pick) {
                    case "1":
                        //integer
                        System.out.print("Enter 1 to continue or 2 to exit: ");
                        int intchoose = qib.nextInt();
                        if (intchoose == 1) {
                            choice = true; //continue
                        } else if (intchoose == 2) {
                            run = false; //exit
                            choice = true;
                        } else {
                            System.out.println("Invalid. Please enter 1 or 2.");
                        }
                        break;

                    case "2":
                        //character
                        System.out.print("Enter 'c' to continue or 'e' to exit: ");
                        char charchoose = qib.next().trim().toLowerCase().charAt(0);
                        if (charchoose == 'c') {
                            choice = true; //continue
                        } else if (charchoose == 'e') {
                            run = false; //exit
                            choice = true;
                        } else {
                            System.out.println("Invalid. Please enter 'c' or 'e'.");
                        }
                        break;

                    case "3":
                        //string
                        System.out.print("Enter 'continue' to continue or 'exit' to exit: ");
                        qib.nextLine(); 
                        String strchoose = qib.nextLine().trim().toLowerCase();
                        if (strchoose.equals("continue")) {
                            choice = true; //continue
                        } else if (strchoose.equals("exit")) {
                            run = false; //exit
                            choice = true;
                        } else {
                            System.out.println("Invalid. Please enter 'continue' or 'exit'.");
                        }
                        break;

                    default:
                        System.out.println("Invalid. Please enter 1, 2, or 3.");
                        break;
                }
            }
        }

        System.out.println("Program terminated.");
        qib.close();
    }
}*/

/*import java.util.Scanner;

public class Choosethree {

    public static void main(String[] args) {
        Scanner qib = new Scanner(System.in);
        boolean run = true;

        while (run) {
            int even = 0;
            int odd = 0;

            // kena enter integer kalau nak end kena type character
            System.out.println("Enter integers. Type a character to end the sequence:");

            while (qib.hasNextInt()) {
                int number = qib.nextInt();
                if (number % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }

            qib.nextLine(); 

            //display berapa number odd or even
            System.out.println("Even numbers: " + even);
            System.out.println("Odd numbers: " + odd);

            //tanya user nak continue ke tak
            boolean choice = false;
            while (!choice) {
                System.out.println("Choose an option to continue:");
                System.out.println("1. Continue with a new sequence (integer input)");
                System.out.println("2. Continue with a new sequence (character input)");
                System.out.println("3. Exit the program (string input)");

                System.out.print("Enter your choice: ");
                String userchoose = qib.nextLine().trim().toLowerCase();

                switch (userchoose) {
                    case "1":
                        //integer
                        System.out.print("Enter 1 to continue or 2 to exit: ");
                        int intchoose = qib.nextInt();
                        qib.nextLine(); 
                        if (intchoose == 1) {
                            choice = true; //continue
                        } else if (intchoose == 2) {
                            run = false; //exit
                            choice = true;
                        } else {
                            System.out.println("Invalid. Please enter 1 or 2.");
                        }
                        break;

                    case "2":
                        //character
                        System.out.print("Pick 'c' to continue or 'e' to exit: ");
                        char charchoose = qib.next().trim().toLowerCase().charAt(0);
                        qib.nextLine(); 
                        if (charchoose == 'c') {
                            choice = true; //continue
                        } else if (charchoose == 'e') {
                            run = false; //exit
                            choice = true;
                        } else {
                            System.out.println("Invalid. Please enter 'c' or 'e'.");
                        }
                        break;

                    case "3":
                        // String option
                        System.out.print("Enter 'continue' to continue or 'exit' to exit: ");
                        String strchoose = qib.nextLine().trim().toLowerCase();
                        if (strchoose.equals("continue")) {
                            choice = true; //continue
                        } else if (strchoose.equals("exit")) {
                            run = false; //exit
                            choice = true;
                        } else {
                            System.out.println("Invalid. Please enter 'continue' or 'exit'.");
                        }
                        break;

                    
                }
            }
        }

        System.out.println("Program terminated.");
        qib.close();
    }
}*/




