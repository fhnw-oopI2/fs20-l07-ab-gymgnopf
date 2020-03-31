package ch.fhnw.oop2.module07.binding;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class BidirectionalExample {

	public static void main(String[] args) {
		
		IntegerProperty a = new SimpleIntegerProperty();
		IntegerProperty b = new SimpleIntegerProperty();
		
		a.set(13);
		b.set(17);
		
		print(a, b); // a: IntegerProperty [value: 13] | b: IntegerProperty [value: 17]
		
		// Bidirektionales Binden. Initialer Wert wird von b übernommen. Eager Binding.
		a.bindBidirectional(b);
		
		print(a, b); // a: IntegerProperty [value: 17] | b: IntegerProperty [value: 17]
		
		a.set(42);
		
		print(a, b); // a: IntegerProperty [value: 42] | b: IntegerProperty [value: 42]
		
		b.setValue(10);
		
		print(a, b); // a: IntegerProperty [value: 10] | b: IntegerProperty [value: 10]
		
		a.unbindBidirectional(b); // Symmetrisch: <=> b.unbindBidirectional(a)
		
		a.set(0);
		
		print(a, b); // a: IntegerProperty [value: 0] | b: IntegerProperty [value: 10]
	}
	
	private static void print(IntegerProperty a, IntegerProperty b) {
		System.out.println("a: " + a + " | " + "b: " + b);
	}

}
