package Shape;

public class Circle  extends Shape{
    public Circle() {
    }

    @Override
    public void resize(double percent) {
        double newRadius = getRadius()*percent/100;
        setRadius(newRadius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    double radius;
}
