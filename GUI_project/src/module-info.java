module GUI_Project {
	requires javafx.controls;
	requires javafx.graphics;
	requires javafx.fxml;
	requires javafx.base;
	
	opens Global_ICT_javaFX to javafx.graphics, javafx.fxml;
}
