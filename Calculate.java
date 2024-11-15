public class Calculate {
    public static void main(String[] args){
        
        int dosum = 0;
        int docount = 1;
        do {
         dosum += docount; 
        docount++;}
        
        while (docount <= 10);
        System.out.println("(Do While) Sum: "+dosum);

        int whisum = 0;
        int whicount = 1; 
        while (whicount <= 10) {
            whisum += whicount;
            whicount++;}
             System.out.println("(While) Sum: " +whisum); 
        
        
            
       int forsum = 0;
        for(int count = 1; count <= 10; count++) {
              forsum += count;}
               System.out.println("(For) Sum: "+forsum); 
        
}
}
