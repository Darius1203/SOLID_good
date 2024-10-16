package good;

public class GoodGraphicsService {

    public void checkForArea(Shape shape) {
        int area = shape.getArea();
        System.out.println("The area of this shape is: " + area);
        if (shape instanceof GoodSquare) {
            System.out.println("Great Square you got there!");
        } else if (shape instanceof GoodRectangle) {
            System.out.println("Great Rectangle you got there!");
        } else {
            System.out.println("Well, not sure what shape this is.");
        }
    }
}