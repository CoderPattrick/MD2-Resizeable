package Shape;

public class Rect  extends Shape {
    double width;
    double height;
    @Override
    public void resize(double percent) {
double newWidth = getWidth()*percent/100;
double newHeight = getHeight()*percent/100;
setHeight(newHeight);
setWidth(newWidth);
    }
    @Override
    public String toString() {
        return "Rect{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Rect(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rect() {
    }
}
