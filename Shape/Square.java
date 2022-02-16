package Shape;

public class Square extends Shape {
    double side;
    @Override
    public void resize(double percent) {
double newSide = getSide()*percent/100;
setSide(newSide);
    }
    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public Square(double side) {
        this.side = side;
    }

    public Square() {
    }
}
