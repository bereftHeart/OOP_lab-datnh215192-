package Global_ICT_javaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class PainterApp extends Application {

    private Canvas canvas;
    private GraphicsContext gc;
    private Color currentColor = Color.BLACK;

    @Override
    public void start(Stage primaryStage) {
        canvas = new Canvas(800, 600);
        gc = canvas.getGraphicsContext2D();
        gc.setFill(Color.WHITE);
        gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());

        Button clearButton = new Button("Clear");
        clearButton.setOnAction(e -> clearCanvas());

        Button redButton = new Button("Red");
        redButton.setOnAction(e -> setCurrentColor(Color.RED));

        Button greenButton = new Button("Green");
        greenButton.setOnAction(e -> setCurrentColor(Color.GREEN));

        Button blueButton = new Button("Blue");
        blueButton.setOnAction(e -> setCurrentColor(Color.BLUE));

        BorderPane root = new BorderPane();
        root.setTop(clearButton);
        root.setLeft(redButton);
        root.setCenter(greenButton);
        root.setRight(blueButton);
        root.setBottom(canvas);

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();

        canvas.setOnMousePressed(e -> {
            gc.setStroke(currentColor);
            gc.beginPath();
            gc.lineTo(e.getX(), e.getY());
            gc.stroke();
        });

        canvas.setOnMouseDragged(e -> {
            gc.lineTo(e.getX(), e.getY());
            gc.stroke();
        });
    }

    private void clearCanvas() {
        gc.setFill(Color.WHITE);
        gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
    }

    private void setCurrentColor(Color color) {
        currentColor = color;
    }

    public static void main(String[] args) {
        launch(args);
    }
}