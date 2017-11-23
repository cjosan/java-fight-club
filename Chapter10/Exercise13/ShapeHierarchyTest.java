//        (Project: Shape Hierarchy) Implement the Shape hierarchy shown in Fig. 9.3. Each Two-
//        DimensionalShape should contain method getArea to calculate the area of the two-dimensional
//        shape. Each ThreeDimensionalShape should have methods getArea and getVolume to calculate the
//        surface area and volume, respectively, of the three-dimensional shape. Create a program that uses
//        an array of Shape references to objects of each concrete class in the hierarchy. The program should
//        print a text description of the object to which each array element refers. Also, in the loop that processes
//        all the shapes in the array, determine whether each shape is a TwoDimensionalShape or a
//        ThreeDimensionalShape. If it’s a TwoDimensionalShape, display its area. If it’s a ThreeDimensionalShape,
//        display its area and volume.

public class ShapeHierarchyTest {

    public static void main(String[] args) throws InvalidTriangleException {
        Shape[] shapes = {new Circle(10), new Square(5), new Triangle(4, 5, 6),
        new Sphere(15), new Cube(10), new Tetrahedron(7)};

        for (Shape shape : shapes) {
            if (shape instanceof TwoDimensionalShape) {
                System.out.println(shape + "\n");
            } else if (shape instanceof ThreeDimensionalShape){
                System.out.println(shape + "\n");
            }
        }
    }
}
