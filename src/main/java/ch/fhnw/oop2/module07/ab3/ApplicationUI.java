package ch.fhnw.oop2.module07.ab3;

import java.text.DecimalFormat;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.StringProperty;
import javafx.geometry.Insets;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.util.converter.NumberStringConverter;

public class ApplicationUI extends VBox {
	private Slider slider;
	private TextField textField;
	
	public ApplicationUI() {
		initializeControls();
		initializeBindings();
		layoutControls();
	}
	/** 
	 * Initialize the controls
	 */
	public void initializeControls() {
		
		textField = new TextField();
		textField.setPrefWidth(Double.MAX_VALUE);
		textField.setPadding(new Insets(5,0,5,0));
		
		
		slider = new Slider(0,10,5.00);
		slider.setShowTickMarks(true);
		slider.setShowTickLabels(true);
		slider.setMajorTickUnit(1);
		slider.setBlockIncrement(0.5f);
		slider.setSnapToTicks(true);	
	}
	
	/** 
	 * add bindings
	 */
	public void initializeBindings() {
		DoubleProperty sliderProperty = slider.valueProperty();
		StringProperty textProperty = textField.textProperty();
		
		NumberStringConverter convert = new NumberStringConverter();
		textProperty.bindBidirectional(sliderProperty,convert);
		
		
		sliderProperty.addListener((observableValue, oldValue, newValue) ->{
			DecimalFormat df = new DecimalFormat("0.00");
			textField.setText(df.format(newValue));
		});
		
	}
	/**
	 * Add controls to the vbox.
	 */
	public void layoutControls() {
		getChildren().add(textField);
		getChildren().add(slider);
		setPadding(new Insets(10));
	}
}
