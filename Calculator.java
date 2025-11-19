import java.util.Scanner;

/**
 * Write a description of class Calculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Calculator
{
    public static void main(String[] args){
     Scanner input= new Scanner(System.in);
        System.out.println("Enter any two no:");
        double num1= input.nextDouble();
        double num2= input.nextDouble();
        
        System.out.println("First no:" + num1); //20
        System.out.println("Second no:" + num2); //30
        
        
        
    }
}