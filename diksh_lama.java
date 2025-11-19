import java.util.Scanner;
 
/**
 * Write a description of class diksh_lama here.
 *
 * @author Dikshant Lama
 * @version v1.00
 */
public class diksh_lama
{
    public static void main(String[] args){
        //There is addition of two numbers
        /*
        int a=10;
        //double d= 10.1;
        //boolean isPassed= true;
        int b=20;
        //int c=a+b;
        //System.out.println(c);
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a>b);
        System.out.println(a<b);
        
        
        int c=1;
        
        System.out.println(c); //c=1
        System.out.println(++c); //++c=2, c=2
        System.out.println(c); //c=2
        System.out.println(c++); //c++=2, c=3
        System.out.println(c); // c=3
        /*
        String name="Dikshant Lama";
        int age=18;
        
        System.out.println("My name is: "+ name + " And, age is: "+ age);
        */
        
        Scanner input= new Scanner(System.in);
        System.out.println("Enter first Number:");
        int firstNum=input.nextInt(); //String, double, boolean
        System.out.println(firstNum);
        
        //Ternery Operator
        
        int age= 28;
        // ()--> conditional
        String isValid=(age >=18)? "Driving is allowed" : "Driving is not allowed";
        System.out.println(isValid);
        
        
    }
}