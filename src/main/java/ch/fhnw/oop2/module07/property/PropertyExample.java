package ch.fhnw.oop2.module07.property;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class PropertyExample {
	
	public static void main(String[] args) {
		
		// Simple[SomeName] sind ausimplementierte Property Klassen.
		final StringProperty textProperty = new SimpleStringProperty("JavaFX");
		
		System.out.println("textProperty:           " + textProperty );
		System.out.println("textProperty.getValue() " + textProperty.getValue() );
		System.out.println("textProperty.get()      " + textProperty.get());
		
		final IntegerProperty number = new SimpleIntegerProperty(42);
		
		System.out.println("number:           " + number );
		System.out.println("number.getValue() " + number.getValue() );
		System.out.println("number.get()      " + number.get());
	}
}

