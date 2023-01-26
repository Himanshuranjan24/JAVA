import java.lang.*;
import java.util.*;
public class factorial
{
    public static void main(String[] args)
    {
        int i ,fact=1,num;
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the number:-");
        num= s.nextInt();
        for(i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        System.out.println("The Factorial of a number is:-"+fact);
    }
}
