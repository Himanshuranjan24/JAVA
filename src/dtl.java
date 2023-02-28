/* 2. A Base class Detail has been defined to store the details of a customer having Data members:
        name ,address,service number/meter number and Member functions: Detail(...) : parameterized
        constructor to assign values to data members and void show() : to display the detail of the customer. Define a subclass PowerBill
        having Data members n : to store the number of units used, Total_bill: to
        store the amount to be paid by the customer and Member functions PowerBill(.....): parameterized
        constructor to assign values to data members of both classes with help of super(....) constructor and
        to initialize amt = 0.0. void cal() : calculates the monthly charge as per the unit range charge given
        below and void show() : to display the detail of the customer and amount to be paid. To compute the monthly power bill of the customer
        follow the chart given below:
        Number Of Units charge per unit
        1 – 50 2.5 rupees
        51 – 100 5 rupees
        101 – 200 6 rupees
        Above 200 7.5 rupees
        Note:Strictly take only the data members and member functions given in the program.*/
import java.lang.*;
import java.util.*;
class Detail {
    private String name;
    private String address;
    private String serviceNumber;
    public Detail(String name, String address, String serviceNumber) {
        this.name = name;
        this.address = address;
        this.serviceNumber = serviceNumber;
    }
    public void show() {
        System.out.println("Customer name: " + name);
        System.out.println("Customer address: " + address);
        System.out.println("Service number/meter number: " + serviceNumber);
    }
}
class PowerBill extends Detail {
    private int n;
    private double totalBill;
    public PowerBill(String name, String address, String serviceNumber, int n) {
        super(name, address, serviceNumber);
        this.n = n;
        this.totalBill = 0.0;
    }
    public void cal() {
        if (n >= 1 && n <= 50) {
            totalBill = n * 2.5;
        } else if (n >= 51 && n <= 100) {
            totalBill = 50 * 2.5 + (n - 50) * 5.0;
        } else if (n >= 101 && n <= 200) {
            totalBill = 50 * 2.5 + 50 * 5.0 + (n - 100) * 6.0;
        } else if (n > 200) {
            totalBill = 50 * 2.5 + 50 * 5.0 + 100 * 6.0 + (n - 200) * 7.5;
        }
    }
    public void show() {
        super.show();
        System.out.println("Number of units used: " + n);
        System.out.println("Amount to be paid: " + totalBill + " rupees");
    }
}
public class dtl {
    public static void main(String[] args) {
        PowerBill pb = new PowerBill("Himanshu", "Masaurhi,patna", "6875", 132);
        pb.cal();
        pb.show();
    }
}
