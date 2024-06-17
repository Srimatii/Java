public class Logicaloperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int x = 30;
        int y = 25;
        boolean result = a>b && x>y;   //And operator
        boolean result1 = a>b || x>y;  //Or operator

        System.out.println("result = " + result);
        System.out.println("result1 = " + result1);

        boolean result2 = !(a>b);   //Not operator
        System.out.println("result2 = " + result2);
}
}
