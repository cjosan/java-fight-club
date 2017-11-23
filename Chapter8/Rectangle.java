public class Rectangle {
    private double width;
    private double height;

    public Rectangle() {
        this(1, 1);
    }

    public Rectangle(double width, double height) {
        setWidth(width);
        setHeight(height);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width > 0.0 && width < 20.0) {
            this.width = width;
        } else {
            System.out.println("The width should be between 0.0 and 20.0");
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height > 0.0 && height < 20.0) {
            this.height = height;
        } else {
            System.out.println("The height should be between 0.0 and 20.0");
        }
    }

    public double getPerimeter() {
        return 2 * width + 2 * height;
    }

    public double getArea() {
        return width * height;
    }
}
