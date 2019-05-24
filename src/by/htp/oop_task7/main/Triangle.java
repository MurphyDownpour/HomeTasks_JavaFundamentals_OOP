package by.htp.oop_task7.main;

public class Triangle {
    private double height;
    private double base;
    private double x;
    private double y;

    public Triangle(double height, double base, double x, double y) {
        this.height = height;
        this.base = base;
        this.x = x;
        this.y = y;
    }

    public void getArea() {
        double area = 0.5 * base * height;

        System.out.println("Площадь треугольника равна " + area);
    }

    public void getPerimeter() {
        double perimeter = x + y + base;

        System.out.println("Периметр треугольника равен " + perimeter);
    }
}
