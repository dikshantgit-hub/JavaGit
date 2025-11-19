
/**
 * Write a description of class DeafultValue here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DeafultValue
{
    byte byteValue;
    short shortValue;
    int intValue;
    long longValue;
    float floatValue;
    double doubleValue;
    char charValue;
    boolean booleanValue;

    public static void main(String[] args) {

        DeafultValue o = new DeafultValue();
        
        System.out.println("byte: " + o.byteValue);
        System.out.println("short: " + o.shortValue);
        System.out.println("int: " + o.intValue);
        System.out.println("long: " + o.longValue);
        System.out.println("float: " + o.floatValue);
        System.out.println("double: " + o.doubleValue);
        System.out.println("char: '" + o.charValue + "A"); 
        System.out.println("boolean: " + o.booleanValue);
    }
}