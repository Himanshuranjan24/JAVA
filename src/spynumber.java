/* Write a program in java to find given number is a spy number or not.
A positive integer is called a spy number if the sum and product of its digits are
equal. In other words, a number whose sum and product of all digits are equal is
called a spy number. Let's take the number 1124 and check whether the number is a spy or not. First, we
 will split it into digits (1, 1, 2, 4). After that find the sum and product of all the digits. Sum=1+1+2+4=8
 Product=1*1*2*4=8
  */
import java.lang.*;
import java.util.*;
public class spynumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();

        int sum = 0;
        int product = 1;
        int temp = num;

        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }

        if (sum == product) {
            System.out.println(num + " is a spy number");
        } else {
            System.out.println(num + " is not a spy number");
        }
    }
}
