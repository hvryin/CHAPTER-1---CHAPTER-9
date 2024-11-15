public class CompoundProg {
    public static void main(String[] args) {

        int a = 7, b = 1, c = 9, d = 5;

        System.out.println("Initial value of a: " + a);
        System.out.println("Pre-increment (++a): " + ++a); 
        System.out.println("Value a after pre-increment: " + a);

        System.out.println("\nInitial value of b: " + b);
        System.out.println("Post-increment (b++): " + b++); 
        System.out.println("Value b after post-increment: " + b);

        System.out.println("\nInitial value of c: " + c);
        System.out.println("Pre-decrement (--c): " + --c); 
        System.out.println("Value c after pre-decrement: " + c);

        System.out.println("\nInitial value of d: " + d);
        System.out.println("Post-decrement (d--): " + d--);
        System.out.println("Value d after post-decrement: " + d);
    }
}
       