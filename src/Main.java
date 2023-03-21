public class Main {
    public static void main(String[] args) {
        Volume[] volumes = new Volume[4];
        volumes[0] = new Sphere(5.0);
        volumes[1] = new Cylinder(4.0, 8.0);
        volumes[2] = new Cuboid(3.0, 4.0, 5.0);
        volumes[3] = new Cone(6.0, 10.0);
        for (int i = 0; i < volumes.length; i++) {
            System.out.println("Volume of object " + (i + 1) + ": " + volumes[i].find_volume());
        }
    }
}

