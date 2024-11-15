import java.util.Scanner;

public class DiscountRate {
    public static void main(String[] args) {
        
        int itemcolour;  // Renamed to follow Java naming conventions
        int itemname;
        int quantity = 0, price = 0;
        double discountrate, before, totalprice, discountamount, after;
        
        Scanner peace = new Scanner(System.in); // Renamed variable for clarity
            
        System.out.println("Please enter colour:");
        System.out.println("1. Purple (50%)");
        System.out.println("2. Red (40%)");
        System.out.println("3. Pink (30%)");
        System.out.println("4. Orange (20%)");
        System.out.println("5. Yellow (10%)");
        System.out.println("Number chosen: ");
        itemcolour = peace.nextInt();
        
        System.out.println("Please enter item name:");
        System.out.println("1. Bolognese Pasta : RM 12");
        System.out.println("2. Pesto Pasta     : RM 16");
        System.out.println("3. Carbonara Pasta : RM 15");
        System.out.println("Number chosen: ");
        itemname = peace.nextInt();
        
        if (itemname == 1) { //if method sebab the input sikit 
            price = 12;
        } else if (itemname == 2) {
            price = 16;
        } else if (itemname == 3) {
            price = 15;
        } else {
            System.out.println("Invalid item name.");
            peace.close(); //close scanner
            return;
        }
        
        System.out.println("Please enter quantity :");
        quantity = peace.nextInt();
        
        switch (itemcolour) { //switch method cause input banyak so it's easief to understand
            case 1: 
                discountrate = 50; break;
            case 2: 
                discountrate = 40; break;
            case 3: 
                discountrate = 30; break;
            case 4: 
                discountrate = 20; break;
            case 5: 
                discountrate = 10; break;
            default: 
                System.out.println("Invalid colour code.");
                discountrate = 0; //set rate 0 for invalid  code
                break;
        }
               
        before = price * quantity;
        discountamount = (discountrate / 100) * before;
        after = before - discountamount;
        
        String itemnamespec = "";
        switch (itemname) {
            case 1: itemnamespec = "Bolognese Pasta"; break;
            case 2: itemnamespec = "Pesto Pasta"; break;
            case 3: itemnamespec = "Carbonara Pasta"; break;
            default: itemnamespec = "Invalid item"; break;
        }
        System.out.println("Item: " +itemnamespec);
        System.out.println("Price: RM " +price);
        System.out.println("Quantity: " +quantity);
        System.out.println("Discount Rate: " +discountrate + "%");
        System.out.println("Discount Amount: RM " +discountamount);
        System.out.println("Total Price After Discount: RM " +after);

        peace.close(); //close scanner 
    }
}



