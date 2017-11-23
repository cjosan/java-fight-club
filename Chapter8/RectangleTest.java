//        (Rectangle Class) Create a class Rectangle with attributes length and width, each of which
//        defaults to 1. Provide methods that calculate the rectangle’s perimeter and area. It has set and get
//        methods for both length and width. The set methods should verify that length and width are each
//        floating-point numbers larger than 0.0 and less than 20.0. Write a program to test class Rectangle.

public class RectangleTest {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println("Rectangle 1" +
                "\nWidth: " + rectangle.getWidth() +
                "\nHeight: " + rectangle.getHeight() +
                "\nPerimeter: " + rectangle.getPerimeter() +
                "\nArea: " + rectangle.getArea());
        System.out.println();

        rectangle.setWidth(-9);
        rectangle.setHeight(22);

        System.out.println();
        rectangle = new Rectangle(10, 10);
        System.out.println("Rectangle 2" +
                "\nWidth: " + rectangle.getWidth() +
                "\nHeight: " + rectangle.getHeight() +
                "\nPerimeter: " + rectangle.getPerimeter() +
                "\nArea: " + rectangle.getArea());
    }
}
