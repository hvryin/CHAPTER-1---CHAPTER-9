import java.util.Scanner;

public class Salesman{
    public static void main(String[] args){
        
        Scanner qib = new Scanner (System.in);
        
        //bagitahu the variables
        int jasminesold = 0, earlgreysold = 0, chamomilesold = 0; 
        final double jtea = 15.00, egtea = 13.00, ctea = 19.00;
        final double basesalary = 600.00;
        final double comrate = 0.05;
        double totalsale, totalearn, commission;
        
        //display menu
        System.out.println("       Welcome to FWG        ");
        System.out.println("1. Jasmine tea     : RM 15.00");
        System.out.println("2. Earl Grey tea   : RM 13.00");
        System.out.println("3. Chamomile tea   : RM 19.00");
        
        //display berapa banyak jual
        System.out.print("Enter how many Jasmine teas sold: ");
        jasminesold = qib.nextInt();

        System.out.print("Enter how many Earl Grey teas sold: ");
        earlgreysold = qib.nextInt();

        System.out.print("Enter how many Chamomile teas sold: ");
        chamomilesold = qib.nextInt();
        
        //ni kira kira
        totalsale = (jasminesold * jtea) + (earlgreysold * egtea) + (chamomilesold * ctea);
        
        commission = totalsale * comrate;
        
        totalearn = basesalary + commission;
        
        //ni display yang kita dah kira kira
        System.out.printf("Total sales for a week: RM %.2f%n", totalsale);
        System.out.printf("Sales commission: RM %.2f%n", commission);
        System.out.printf("Total earn for the week: RM %.2f%n", totalearn);
        
        
        qib.close();

    }
}