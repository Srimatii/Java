import java.util.*;
public class Factorial {
    public static void Factorial(int n){
    int fact = 1;
    for(int i=n ; i>= 1 ; i--){
        fact = fact * i ;
    }
System.out.println(fact);
return ;
    }
public static void main(String [] args){
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the value of n");
    int n = s.nextInt();
    Factorial(n);
}
}
