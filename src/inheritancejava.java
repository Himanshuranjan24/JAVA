/* 6.Illustrate the execution of constructors in multi-level inheritance with three Java classes –plate(length, width),
box(length, width, height), wood box(length, width, height, thick).*/
import java.lang.*;
import java.util.*;
class Plate {
    int length, width;
    public Plate(int length, int width) {
        this.length = length;
        this.width = width;
        System.out.println("Plate constructor called");
    }
}
class Box extends Plate {
    int height;

    public Box(int length, int width, int height) {
        super(length, width);
        this.height = height;
        System.out.println("Box constructor called");
    }
}
class WoodBox extends Box {
    int thickness;

    public WoodBox(int length, int width, int height, int thickness) {
        super(length, width, height);
        this.thickness = thickness;
        System.out.println("WoodBox constructor called");
    }
}
public class inheritancejava{
    public static void main(String[] args) {
        WoodBox woodBox = new WoodBox(10, 10, 10, 2);
        System.out.println("Dimensions of woodBox: " + woodBox.length + " x " + woodBox.width + " x " + woodBox.height + " x " + woodBox.thickness);
    }
}


