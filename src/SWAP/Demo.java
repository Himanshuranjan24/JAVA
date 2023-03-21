package SWAP;
public class Demo {
    public void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping (int): a = " + a + ", b = " + b);
    }
    public void swap(char a, char b) {
        char temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping (char): a = " + a + ", b = " + b);
    }
    public void swap(float a, float b) {
        float temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping (float): a = " + a + ", b = " + b);
    }
    public void swap(double a, double b) {
        double temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping (double): a = " + a + ", b = " + b);
    }
}
