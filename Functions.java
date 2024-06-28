import java.util.*;
public class Functions {
    public  static void printMyname(String name){
        System.out.println("Her name is "+name);
        return ;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = s.next();
        printMyname(name);
    }
}