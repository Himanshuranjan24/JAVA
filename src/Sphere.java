public class Sphere extends Volume {

    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double find_volume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}

