import java.util.Scanner;

public class Simplepurchasingitem {
    public static void main(String[] args) {
        
        int itemname;
        int quantity;
        double price, totalprice;
        String item = "";

        Scanner open = new Scanner(System.in); // Scanner object for input
        
        // Display the item choices and prices
        System.out.println("WELCOME! Please choose your item: ");
        System.out.println("1. Red Hot Chicken (6 pieces)    : RM 20 ");
        System.out.println("2. Soy Sauce Chicken (6 pieces)  : RM 17");
        System.out.println("3. Cheesy Chicken (6 pieces)     : RM 21");
        System.out.println("4. Buttermilk Chicken (6 pieces) : RM 23");
        System.out.println("Item chosen:");
        itemname = open.nextInt();
        
        // Determine the price based on itemname
        if (itemname == 1) {
            price = 20;
        } else if (itemname == 2) {
            price = 17;
        } else if (itemname == 3) {
            price = 21;
        } else if (itemname == 4) {
            price = 23;
        } else {
            System.out.println("Invalid item name.");
            open.close(); //close scanner
            return; //exit program
        }
        
        System.out.println("Please enter quantity: "); //display selected quantity
        quantity = open.nextInt();
        
        totalprice = price * quantity; //calculate price
        
        switch (itemname) { //ni for display kat item name
            case 1: item = "Red Hot Chicken"; break;
            case 2: item = "Soy Sauce Chicken"; break;
            case 3: item = "Cheesy Chicken"; break;
            case 4: item = "Buttermilk Chicken"; break;
            
        }
        //display all the output
        System.out.println("Item Name: " +item);
        System.out.println("Price: RM " +price);
        System.out.println("Quantity: " +quantity);
        System.out.println("Total Price: RM " +totalprice);
        
        open.close(); // close scanner
    }
}
