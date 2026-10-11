
class Cube {
    private double side;

    public void setSide(double side) {
        this.side = side;
    }

    public double getVolume() {
        return side * side * side;
    }
}

class RectangularPrism {
    private double length;
    private double width;
    private double height;

    public void setDimensions(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getVolume() {
        return length * width * height;
    }
}

class Cylinder {
    private double radius;
    private double height;

    public void setDimensions(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getVolume() {
        return Math.PI * radius * radius * height;
    }
}

public class Main {
    public static void main(String[] args) {
        Cube cube = new Cube();
        cube.setSide(5);
        System.out.println("Volume of Cube: " + cube.getVolume());

        RectangularPrism box = new RectangularPrism();
        box.setDimensions(4, 3, 2);
        System.out.println("Volume of Rectangular Prism: " + box.getVolume());

        Cylinder cylinder = new Cylinder();
        cylinder.setDimensions(3, 7);
        System.out.println("Volume of Cylinder: " + cylinder.getVolume());
    }
}
