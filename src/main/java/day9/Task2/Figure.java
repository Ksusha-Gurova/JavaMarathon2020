package day9.Task2;

public abstract class Figure {
    protected String color;
    protected double area;
    protected double perimeter;

    public Figure(String color) {
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract double area();
    public abstract double perimeter();

}
