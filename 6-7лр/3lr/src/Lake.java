public class Lake {
    private String name;
    private double depth;
    private double area;

    public Lake(String name, double depth, double area) {
        this.name = name;
        this.depth = depth;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public double getDepth() {
        return depth;
    }

    public double getArea() {
        return area;
    }

    @Override
    public String toString() {
        return name + " (глубина: " + depth + " м, площадь: " + area + " км²)";
    }
}