package ch.fhnw.oop2.module07.event;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.GridPane;

final class EventHandler extends GridPane {
	
	private Button button;
	private RadioButton radioButton;
	private CheckBox checkBox;
	
	
	EventHandler() {
		initializeControls();
		layoutControls();
	}
	
	private void initializeControls() {
		button = new Button("Action");
		button.setOnAction(event -> System.out.println(event));
		// Oder: button.setOnAction(event -> System.out.println(event));
		button.setOnMouseEntered(System.out::println); // Ist in Node definiert.
		
		radioButton = new RadioButton();
		radioButton.setOnAction(System.out::println);
		
		checkBox = new CheckBox();
		checkBox.setOnAction(System.out::println);
	}
	
	private void layoutControls() {
		
		add(button, 0, 0);
		add(radioButton, 1, 0);
		add(checkBox, 2, 0);
		
		setMargin(button, new Insets(20));
		setMargin(radioButton, new Insets(20));
		setMargin(checkBox, new Insets(20));
	}
}

