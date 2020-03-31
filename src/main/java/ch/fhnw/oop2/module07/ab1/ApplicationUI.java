package ch.fhnw.oop2.module07.ab1;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;


public class ApplicationUI extends FlowPane {
	
	private Button button;

	
	public ApplicationUI() {
		initializeControls();
		layoutControls();
	}
	public void initializeControls() {
		button = new Button("Add Label");
		button.setOnAction(e -> {
			Label lbl = new Label("neues Label");
			lbl.setPadding(new Insets(10,5,10,5));
			getChildren().add(lbl);
		});
	}
	
	public void layoutControls() {
		setPadding(new Insets(10));
		setPrefWidth(400);
		getChildren().add(button);
		
	}
}
