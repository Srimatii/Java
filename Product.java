import java.util.*;
public class Product{
    public static int Calculateproduct(int a, int b){
        int pro = a * b;
        return pro;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values for a & b");
        int a = sc.nextInt();
        int b = sc.nextInt();
       
        int pro = Calculateproduct(a,b);
        System.out.println("The sum is " +pro);
    }
}

