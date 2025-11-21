import java.util.Scanner;

/**
 * Write a description of class RickshwaFare here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RickshwaFare
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double distance = input.nextDouble();
        double time = input.nextDouble();
        
        System.out.println("Distance(in km):"+ distance);
        System.out.println("Time(in min):"+ time);

        System.out.print("Is the customer local? Yes : No");
        String LocalInput = input.next();

        System.out.print("Is it night-time travel? Yes : No");
        String NightInput = input.next();


        boolean Local = LocalInput.equalsIgnoreCase("yes") ? true : false;
        boolean Night = NightInput.equalsIgnoreCase("yes") ? true : false;

        double baseFare = 50;
        double perKmRate = 20;
        double perMinuteRate = 2;


        double totalFare = baseFare + (distance * perKmRate) + (time * perMinuteRate);


        if (Local && distance > 10) {
            totalFare = totalFare * 0.90;
        }

        if (Night) {
            totalFare = totalFare * 1.15; // 
        }

        System.out.println("Final Fare: Rs. " + totalFare);
    }
}