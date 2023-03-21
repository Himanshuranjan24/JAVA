/*3. Write a program to create a class Savings_Account. Use a static variable annual_Interest_Rate to
        store the annual interest rate for all account holders. Each object of the class contains a private
instance variable savings_Balance indicating the amount the saver currently has on deposit. Provide
        method calculate_Monthly_Interest to calculate the monthly Interest by multiplying the
        savings_Balance by annual_Interest_Rate divided by 12 and this interest should be added to
        savings_Balance. Provide a static method modify_Interest_Rate that sets the annual_Interest_Rate to
        a new value. Write a program to test class Savings_Account. Instantiate two savings Account objects, saver1 & saver2, with balances
        of $2000.00 and $3000.00 respectively. Set annual_Interest_Rate to
        4%, then calculate the monthly interest and print the new balances for both savers. Then set the
        annual_Interest_Rate to 5%, calculate the next month's interest and print the new balances for both
        savers.*/
import java.lang.*;

public class savingaccont {
    private static double annual_Interest_Rate = 0.0;
    private double savings_Balance;
    public savingaccont(double balance) {
        savings_Balance = balance;
    }
    public void calculate_Monthly_Interest() {
        double monthly_Interest_Rate = annual_Interest_Rate / 12;
        savings_Balance += savings_Balance * monthly_Interest_Rate;
    }

    public static void modify_Interest_Rate(double newRate) {
        annual_Interest_Rate = newRate;
    }

    public double get_Savings_Balance() {

        return savings_Balance;
    }

    public static void main(String[] args) {
        savingaccont saver1 = new savingaccont(2000.0);
        savingaccont saver2 = new savingaccont(3000.0);
        savingaccont.modify_Interest_Rate(0.04);
        saver1.calculate_Monthly_Interest();
        saver2.calculate_Monthly_Interest();
        System.out.println("Saver 1 balance after 1 month: " + saver1.get_Savings_Balance());
        System.out.println("Saver 2 balance after 1 month: " + saver2.get_Savings_Balance());
        savingaccont.modify_Interest_Rate(0.05);
        saver1.calculate_Monthly_Interest();
        saver2.calculate_Monthly_Interest();
        System.out.println("Saver 1 balance after 2 months: " + saver1.get_Savings_Balance());
        System.out.println("Saver 2 balance after 2 months: " + saver2.get_Savings_Balance());
    }
}