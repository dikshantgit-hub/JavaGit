
/**
 * Write a description of class waterlevel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class waterlevel
{
    public static void main(String[] args){
    double Waterlevel = 500;
    
    System.out.println("Current water level" + Waterlevel + "L");
     String status = (Waterlevel >= 1000)? "WARNING: Water has reached 1000L or more" : "Water level is Normal"; // Current Water level is 500L
     System.out.println(status);
    
        
        
        
        
        
        
        
    }
}