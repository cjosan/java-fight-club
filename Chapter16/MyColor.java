import javafx.scene.paint.Color;

import java.util.HashMap;

public class MyColor extends HashMap<String, Color> {
    public MyColor() {
        put("red", javafx.scene.paint.Color.RED);
        put("green", javafx.scene.paint.Color.GREEN);
        put("blue", javafx.scene.paint.Color.BLUE);
        put("black", javafx.scene.paint.Color.BLACK);
        put("white", javafx.scene.paint.Color.WHITE);
        put("gray", javafx.scene.paint.Color.GRAY);
        put("lightgray", javafx.scene.paint.Color.LIGHTGRAY);
        put("darkgray", javafx.scene.paint.Color.DARKGRAY);
        put("pink", javafx.scene.paint.Color.PINK);
        put("yellow", javafx.scene.paint.Color.YELLOW);
        put("orange", javafx.scene.paint.Color.ORANGE);
        put("magenta", javafx.scene.paint.Color.MAGENTA);
        put("cyan", javafx.scene.paint.Color.CYAN);
    }
}
