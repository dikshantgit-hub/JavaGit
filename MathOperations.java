
/**
 * Write a description of class MathOperations here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MathOperations
{
    public static void main(String[] args){
        //Arithmetic Operations
        int a=10;
        int b=20;
        
        System.out.println("Sum="+(a+b));
        System.out.println("Product="+(a*b));
        System.out.println("Divide="+(a/b));
        System.out.println("Subtraction="+(a-b));
        
        //Unary (post-increment and pre-increment operators
        int pos=2;
        int pre=2;
        System.out.println("post-increment="+pos++);
        System.out.println("pre-increment="+pre++);
        
        //Assignment 
        
        
        //Relational
        int p = 8; 
        int q = 12;
        
        System.out.println("p == q -" + (p == q));
        System.out.println("p != q - " + (p != q));
        System.out.println("p < q -" + (p < q));
        System.out.println("p > q - " + (p > q));
        System.out.println("p <= q - " + (p <= q));
        System.out.println("p >= q - " + (p >= q));
        
        
        //Logical 
        boolean c1 = (a > b);
        boolean c2 = (a < b);

        System.out.println("c1 = " + c1 + ", c2 = " + c2);
        System.out.println("c1 && c2 → " + (c1 && c2));
        System.out.println("c1 || c2 → " + (c1 || c2));
        System.out.println("!c1 → " + (!c1));
        
        
        
        //Ternary
        double Waterlevel = 500;
    
    System.out.println("Current water level" + Waterlevel + "L");
     String status = (Waterlevel >= 1000)? "WARNING: Water has reached 1000L or more" : "Water level is Normal"; // Current Water level is 500L
     System.out.println(status);
        
        
        
    }
}