package lab.exercise2;

/**
 *
 * @author jlombardo
 */
public class Startup {
    public static void main(String[] args) {
        Shape circle = new Circle();
        System.out.println("Circle with normal border");
        circle.draw();

        Shape rectangle = new Rectangle();
        System.out.println("\nRectangle with normal border");
        rectangle.draw();

        Shape decoratedCircle = new RedBorderDecorator(circle);
        System.out.println("\nCircle with Red Border");
        decoratedCircle.draw();
        
        Shape decoratedRectangle = new RedBorderDecorator(rectangle);
        System.out.println("\nRectangle with Red Border");
        decoratedRectangle.draw();
    }
}
