package LET_ME_Calculate;
        import calculator.CALC;

public class Calculate {

    public static void main(String[] args) {

        CALC calculator = new CALC();

        int a = 10, b = 5;
        System.out.println("Addition: " + calculator.add(a, b));
        System.out.println("Subtraction: " + calculator.subtract(a, b));
        System.out.println("Multiplication: " + calculator.multiply(a, b));
        System.out.println("Division: " + calculator.divide(a, b));
        System.out.println("Modulus: " + calculator.mod(a, b));
    }
}
