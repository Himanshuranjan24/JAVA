public class Cylinder extends Volume {

    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double find_volume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }
}

