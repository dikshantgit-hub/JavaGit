import java.util.Scanner;

/**
 * Write a description of class GradeEvalu here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GradeEvalu
{
    public static void main(String[] args){

        Scanner c = new Scanner(System.in);
        System.out.print("Enter grade");
        int grade = c.nextInt();

        String result = (grade >= 40) ? "Pass" : "Fail";

        System.out.println("Result: " + result);
        
}
}