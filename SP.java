import java.util.Scanner;

/**
 * Write a description of class SP here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SP
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        float MP,Discount=0;
        float SP=0;
        char cat;
        
        System.out.print("Enter the marpket price:");
        MP = sc.nextFloat();
        System.out.print("Enter the category of give data:");
        cat = sc.next().charAt(0);
        
        
            
     if (cat == 'A' || cat == 'a' ){
            SP = MP-(MP * 0.6f);
            System.out.print("Selling price is:" + SP);
        }
        
        
     else if(cat == 'B' || cat == 'b'){
            SP = MP-(MP * 0.4f);
            System.out.print("Selling price is:" + SP);
        }
        
      
     else if(cat == 'C' || cat == 'c'){
            SP = MP-(MP * 0.2f);
            System.out.print("Selling price is:" + SP);
        }
        
        
     else if (cat == 'D' || cat == 'd'){
            SP = MP-(MP * 0.1f);
            System.out.print("Selling price is:" + SP);
        }  
       else{ 
        
            System.out.print("ERROR");
            SP=MP;
        }
        
        System.out.print("Selling price is:" + SP);
        
        
        
        
    }
}