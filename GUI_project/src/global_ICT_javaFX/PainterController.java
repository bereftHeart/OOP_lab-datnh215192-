package Global_ICT_javaFX;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class PainterController {

    @FXML
    private RadioButton btnEraser;

    @FXML
    private RadioButton btnPen;

    @FXML
    private Pane drawingAreaPane;

    @FXML
    private ToggleGroup identical;

    private Color color = Color.BLUE;
    
    @FXML
    void clearButtonPressed(ActionEvent event) {
    	drawingAreaPane.getChildren().clear();
    }

    @FXML
    void drawingAreaMouseDragged(MouseEvent event) {
		Circle newCircle = new Circle(event.getX(), event.getY(), 1, color);
        drawingAreaPane.getChildren().add(newCircle);
    }

}
