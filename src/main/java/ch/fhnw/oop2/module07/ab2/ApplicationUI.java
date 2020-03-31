package ch.fhnw.oop2.module07.ab2;

import java.text.DecimalFormat;

import javafx.beans.property.DoubleProperty;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.VBox;

public class ApplicationUI extends VBox  {

	private Slider slider;
	private Label label;
	
	public ApplicationUI() {
		initializeControls();
		initializeBindings();
		layoutControls();
	}
	/** Initialize the controls
	 * 
	 */
	public void initializeControls() {
		
		label = new Label("5");
		label.setAlignment(Pos.CENTER);
		label.setPrefWidth(Double.MAX_VALUE);
		label.setPadding(new Insets(5,0,5,0));
		
		
		slider = new Slider(0,10,5);
		slider.setShowTickMarks(true);
		slider.setShowTickLabels(true);
		slider.setMajorTickUnit(1);
		slider.setBlockIncrement(0.5f);
		slider.setSnapToTicks(true);	
	}
	
	public void initializeBindings() {
		DoubleProperty currentValue = slider.valueProperty();
		
		currentValue.addListener((observableValue, oldValue, newValue) ->{
			DecimalFormat df = new DecimalFormat("0.00");
			label.setText(df.format(newValue));
		});
		
	}
	/**
	 * Add controls to the vbox.
	 */
	public void layoutControls() {
		getChildren().add(label);
		getChildren().add(slider);
		setPadding(new Insets(10));
	}
	
	
}
