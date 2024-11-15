import java.util.Scanner;

public class AverageMark {
    
    public static void main(String[] args) {
        
        String name;
        String id;
        String subject;
        double test1, test2, averagemarks;
        
        Scanner k = new Scanner(System.in); 
            
            System.out.println("Please enter name :");
            name=k.nextLine();
            
            System.out.println("Please enter ID :");
            id=k.nextLine();
           
            System.out.println("Please enter subject :");
            subject=k.nextLine();
            
             System.out.println("Please enter Test1 Mark (/100) :");
            test1=k.nextInt();
            
            System.out.println("Please enter Test2 Mark (/100) :");
            test2=k.nextInt();
            
            averagemarks = (test1 + test2)/ 2.0;
            
            k.close();
       
        //Prints name, age, and student id to the 
        System.out.println("Name :"+name);
        System.out.println("ID :"+id);
        System.out.println("Subject :"+subject);
        System.out.println("Test1 :"+test1);
        System.out.println("Test2 :"+test2);
        System.out.println("Average Marks :"+averagemarks);
        
        
    }
}

