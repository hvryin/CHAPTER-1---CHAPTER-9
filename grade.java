
import java.util.Scanner;

/**
 *
 * @author hvryn
 */
public class grade {
    public void grAde(){
         Scanner qib = new Scanner(System.in);

        int[] marks = new int[10];
        int totala = 0, totalb = 0, totalc = 0, totald = 0, totale = 0;
        
        //display 10 marks 
        System.out.println("Put in 10 marks:");
        for (int l = 0; l < 10; l++) {
            System.out.print("Mark " + (l + 1) + ": ");
            marks[l] = qib.nextInt();
        }
        
        //process each mark and categorize
        for (int mark : marks) {
            if (mark >= 90) {
                totala++;
            } else if (mark >= 80) {
                totalb++;
            } else if (mark >= 70) {
                totalc++;
            } else if (mark >= 60) {
                totald++;
            } else {
                totale++;
            }
        }
        
        //display number of marks by each grade 
        System.out.println("Out of 10:");
        System.out.println("Grade A: " +totala);
        System.out.println("Grade B: " +totalb);
        System.out.println("Grade C: " +totalc);
        System.out.println("Grade D: " +totald);
        System.out.println("Grade E: " +totale);
    }
}

    

