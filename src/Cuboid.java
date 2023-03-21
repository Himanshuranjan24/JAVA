public class Cuboid extends Volume {

    private double length;
    private double width;
    private double height;

    public Cuboid(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public double find_volume() {
        return length * width * height;
    }
}
