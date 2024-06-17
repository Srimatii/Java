

public class StringBuffers {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello ");
        sb.append("World");
        System.out.println(sb); // prints "Hello World"
        

        sb.deleteCharAt(3);
        System.out.println(sb); 
    }

    
}
