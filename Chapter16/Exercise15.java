import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.util.Scanner;

public class Exercise15 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String color;

        while (true) {
            System.out.println("Enter the color of circle");
            color = scanner.nextLine();

            if (new MyColor().keySet().contains(color)) {
                break;
            }
        }

        Pane pane = new StackPane();
        Circle circle = new Circle(100);
        circle.setFill(new MyColor().get(color));
        pane.getChildren().add(circle);

        Scene scene = new Scene(pane, 250, 250);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Colored Circle");
        primaryStage.show();
    }
}
