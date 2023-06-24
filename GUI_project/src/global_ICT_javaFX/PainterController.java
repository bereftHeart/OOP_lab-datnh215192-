package global_ICT_javaFX;

import javafx.fxml.FXML;

import javafx.event.ActionEvent;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class PainterController extends BorderPane{
	@FXML
	private Pane drawingAreaPane;
	
	@FXML
    private ToggleGroup tool;
    @FXML
    private RadioButton penButton = new RadioButton();
    @FXML
    private RadioButton eraserButton = new RadioButton();

    private Color color;

    @FXML
    void init() {
        penButton.setSelected(true);
        color = Color.BLACK;

        tool.selectedToggleProperty().addListener((observable, oldToggle, newToggle) -> {
            if (newToggle == penButton) {
                color = Color.BLACK;
            } else if (newToggle == eraserButton) {
                color = Color.WHITE;
            }
        });
    }

	// Event Listener on Button.onAction
	@FXML
	public void clearButtonPressed(ActionEvent event) {
	}
	// Event Listener on Pane[#drawingAreaPane].onMouseDragged
	@FXML
	public void drawingAreaMouseDragged(MouseEvent event) {
	}
}
