package day9.Task2;

public class Rectangle extends Figure{
    private double weight;
    private double leight;

    public Rectangle(double weight, double leight, String color) {
        super(color);
        this.weight = weight;
        this.leight = leight;
    }

    @Override
    public double area() {
        area= weight * leight;
        return area;
    }

    @Override
    public double perimeter() {
        perimeter = (weight + leight) * 2;
        return 0;
    }
}
