/*1. WAP in JAVA having class called Address with 2 methods called getAddress() and setAddress(). The
     Address class will have three child classes named HomeAddress, OfficeAddress, SchoolAddress having
     same functions as Address class. Use dynamic method dispatch concept to override the derived class
methods and display the address of home, office and school accordingly.*/
import java.lang.*;
import java.util.*;
class Address{
    public String address;
    public void getAddress() {
        System.out.println("Address: " + address);
    }
    public void setAddress(String address) {
        this.address = address;
    }
}
class HomeAddress extends Address {

    public void getAddress() {
        System.out.println("Home Address: " + super.address);
    }
    public void setAddress(String address) {
        super.setAddress(address);
    }
}
class OfficeAddress extends Address {
    public void getAddress() {
        System.out.println("Office Address: " + super.address);
    }
    public void setAddress(String address) {
        super.setAddress(address);
    }
}
class SchoolAddress extends Address {
    public void getAddress() {
        System.out.println("School Address: " + super.address);
    }
    public void setAddress(String address) {
        super.setAddress(address);
    }
}
public class childaddress {
    public static void main(String[] args) {
        HomeAddress homeAddress = new HomeAddress();
        homeAddress.setAddress("Masaurhi");
        homeAddress.getAddress();
        OfficeAddress officeAddress = new OfficeAddress();
        officeAddress.setAddress("Microsoft,Patna");
        officeAddress.getAddress();
        SchoolAddress schoolAddress = new SchoolAddress();
        schoolAddress.setAddress("St.Karen's High School Gola Road");
        schoolAddress.getAddress();
    }
}