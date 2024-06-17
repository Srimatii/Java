

public class Strings {
    public static void main(String[] args) {
        String str = "Satoru Gojo"; // String literal
        System.out.println(str);

        System.out.println(str.hashCode()); //hashcode

        String name = "Sri";
        name = name + " Reddy";
        System.out.println(name); //String concatenation

        String s1 = "Sri";
        String s2 = "Sri";
        System.out.println(s1 == s2); //true because both are pointing to same string literal
        
    }
}
