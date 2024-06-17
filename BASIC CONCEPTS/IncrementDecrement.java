public class IncrementDecrement 
{
 public static void main(String a[]) {
    // num1 = num1+1;
    //num1 += 1
    //num++

    //post-increment   //Fetch the value first and then increment.
    int num = 7;
    int result = num++;
    System.out.println(result);

    //pre-increment   //Increment first and then fetch the value
    int num1 = 20;
    int result1 = ++num1;
    System.out.println(result1);

    //post-decrement
    int num2 = 7;
    int result2 = num2--;
    System.out.println(result2);

    //pre-decrement
    int num3 = 20;
    int result3 = --num3;
    System.out.println(result3);
    }  
}
