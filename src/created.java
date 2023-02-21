/*5. WAP in java to count number of objects created from a class using concept of constructors and static data members.*/
import java.lang.*;
import java.util.*;
class objectscreated {
    static int count = 0;

    public objectscreated() {
        count++;
    }
}

public class created{
    public static void main(String[] args) {
        objectscreated obj1 = new objectscreated();
        objectscreated obj2 = new objectscreated();
        objectscreated obj3 = new objectscreated();
        objectscreated obj4 = new objectscreated();

        System.out.println("Number of objects created: " + objectscreated.count);
    }
}

