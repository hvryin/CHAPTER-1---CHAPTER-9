import java.util.Scanner;

public class ArithmeticOperator {
    public static void main(String[] args){
        
        Scanner lol = new Scanner(System.in); //scanner object for input
       
         int pick, num1, num2, sum;
         float addition, substraction, divide, multiplication;
      
         System.out.println("Please enter operator :"); //display operator
         System.out.println("1. (+)");
         System.out.println("2. (-)");
         System.out.println("3. (*)");
         System.out.println("4. (/)");
         System.out.println("Number chosen: ");
         pick = lol.nextInt();
         
         System.out.println("First num:"); //display first number
         num1 = lol.nextInt();
         System.out.println("Second num:"); //display second number
         num2 = lol.nextInt();
        
         switch (pick){ //guna switch method
             
             
             case 1:
                 addition = num1 + num2;
                 System.out.println("add = " +addition); break;
       
             
             case 2: 
                 substraction = num1 - num2;
                 System.out.println("substract = " +substraction); break;
             
             
             case 3: 
                 multiplication = num1 * num2;
                 System.out.println("multiply = " +multiplication); break;
             
             
             case 4: 
                 divide = num1 / num2;
                 System.out.println("divide = " +divide); break;
             
             default : System.out.println("Invalid answers");
         
         }
        
        
        lol.close();
    }
    }
