package MAIN;
import SWAP.Demo;
public class Test {
    public static void main(String[] args) {
        Demo demo = new Demo();
        int x = 10, y = 20;
        System.out.println("Before Swapping (int): x = " + x + ", y = " + y);
        demo.swap(x, y);
        char a = 'a', b = 'b';
        System.out.println("Before Swapping (char): a = " + a + ", b = " + b);
        demo.swap(a, b);
        float f1 = 10.5f, f2 = 20.5f;
        System.out.println("Before Swapping (float): f1 = " + f1 + ", f2 = " + f2);
        demo.swap(f1, f2);
        double d1 = 100.25, d2 = 200.25;
        System.out.println("Before Swapping (double): d1 = " + d1 + ", d2 = " + d2);
        demo.swap(d1, d2);
    }
}
