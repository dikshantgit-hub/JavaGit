
/**
 * Write a description of class Gitbaba here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Gitbaba
{
    int age;  // instance variable
    static int agr; //static variable
    
    public static void main(String[] args){
        
        int qty=30; //local variable 
        System.out.println("Hello Git");
        
        // <className> <variable>= new <className>();
        Gitbaba w1= new Gitbaba();
        
        System.out.println(w1.age);
        System.out.println(agr);
        
    }
}