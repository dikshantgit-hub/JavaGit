
/**
 * Write a description of class Tutorial here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tutorial
{
    public static void main(String[] args){
        int age; //declare variable
        age=18;
        System.out.println(age);
        
        // Implicit Typecasting --> Widening Casting 
        
        int h=15;
        double k=h;
        System.out.println(k);
        
        short a=55;
        float b=a;
        System.out.println(b);
        
        // Explicit Typecasting --> Narrowing Casting
        
        double y=23.55;
        int z= (int)y;
        System.out.println(z);
        
        //Exception in arthmetic operations
        
        short m=10;
        short n=5;
        short sum= (short)(m+n);
        
        //let's check max, min and size of the values
        
        //for byte
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.SIZE);
        System.out.println(Byte.BYTES);
        
        //For short
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.SIZE);
        System.out.println(Short.BYTES);
        
        //For int
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.SIZE);
        System.out.println(Integer.BYTES);
        
        //For long
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.SIZE);
        System.out.println(Long.BYTES);
        
        //Escape Sequence
        
        System.out.println("Hello\nWorld");
        System.out.println("Hello\tDIKSHANT");
        System.out.println("I said \"Hi\"");
        System.out.println("\u2764");
        
        
        
        
        
    }
}