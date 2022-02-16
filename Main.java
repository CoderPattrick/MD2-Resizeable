import Shape.*;

public class Main {
    public static void main(String[] args) {
        Shape shapes[] =new Shape[3];
        shapes[0]=new Circle(10);
        shapes[1]=new Rect(10,10);
        shapes[2]=new Square(10);
        for (Shape s:shapes
             ) {
            System.out.println(s);
        }
        System.out.println("After-resize:");
        for (Shape s:shapes
             ) {
            s.resize(150);
            System.out.println(s);
        }
    }
}
