public class Relationaloperators
{
    public static void main(String[] args) 
    {
        int x = 17;
        int y = 16;
        boolean result = x < y;  //less than
        boolean result1 = x > y;  //greater than
        boolean result2 = x == y;  //equal to
        boolean result3 = x != y;  //not equal to
        boolean result4 = x <= y;  //less than or equal to
        boolean result5 = x >= y;  //greater than or equal to
        System.out.println(x + " less than " +y+ " = " +result); 
        System.out.println(x + " greate than " +y+ " = " +result1); 
        System.out.println(x + " equal to " +y+ " = " +result2);
        System.out.println(x + " not equal to " +y+ " = " +result3);
        System.out.println(x + " less than or equal to " +y+ " = " +result4);
        System.out.println(x + " greater than or equal to " +y+ " = " +result5);
     }
    
}
