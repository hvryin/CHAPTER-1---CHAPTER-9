import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        
        int finalmarks;
        
        Scanner qib = new Scanner(System.in); //scanner object for input
        
        System.out.println("Enter final marks (50-100): "); //ni display input
        finalmarks = qib.nextInt(); //ni nanti dia keluarkan the input
        
        if (finalmarks < 50 || finalmarks > 100) {//ni tunjuk whether finalmarks tu bawah 50 or 100
            
            System.out.println("Invalid mark. Enter value between 50 to 100 only.");}//ni dia display kalau marks tu bawah dari 50
        else{ 
        
        if (finalmarks >= 90){ //ni markah from 90 to 100
            System.out.println("Grade A");} //ni dia display if dapat markah from 90 to 100
        else if (finalmarks >= 85){
            System.out.println("Grade A-");}
        else if (finalmarks >= 80) {
            System.out.println("Grade B+");}
        else if (finalmarks >= 70){
            System.out.println("Grade B");}
        else if (finalmarks >= 60){
            System.out.println("Grade C+");}
        else if (finalmarks >= 50){
             System.out.println("Grade C");}
        
        
        qib.close(); //close scanner
                      
            
        
    }
    }
}
