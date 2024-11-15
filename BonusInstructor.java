import java.util.Scanner;

public class BonusInstructor{
    public static void main(String[] args){
        
        Scanner qib = new Scanner (System.in);
        
        int numstu;
        System.out.println("Enter num of students: ");
        numstu = qib.nextInt();
        
         if (numstu <= 0) { //student takleh bawah or sama dengan 0
            System.out.println("Students must be greater than 0.");
            qib.close();
            return;
        }
         
         int pass = 0;
         
           for (int i = 0; i < numstu; i++) { //ni dia display kalau ada number of students
            System.out.print("Enter result for student " + (i + 1) + " (1 for pass, 0 for fail): ");
            int result = qib.nextInt();
            
            if (result == 1) {
                pass++;
            }
        }
           int fail = numstu - pass;
           
        System.out.println("Students who passed: " + pass); //display siapa pass
        System.out.println("Students who failed: " + fail); //display siapa fail

       
        if (pass > numstu / 2) { //ni display kalau orang pass lebih 
            System.out.println("Bonus to instructor");
        }

        qib.close();    
           
}
}
