import java.util.Scanner;

/**
 * Write a description of class Income here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Income
{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter the annual income in NPR");
        double income = s.nextDouble();
        double tax = 0;
        
        if (income <= 500000) {
            tax = income * 0.01;
        }
        else if (income <= 700000){
            tax = income * 0.10 + (income - 500000) * 0.10;
        }
        else {
            tax = 500000 * 0.01;
            
            tax += 200000 * 0.10;
            
            tax += (income - 700000) * 0.20;
        }
        System.out.println("Total tax is :NPR" + tax);
    }
}