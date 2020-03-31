package ch.fhnw.oop2.module07.binding;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class UnidirectionalExample {

	public static void main(String[] args) {
		
		IntegerProperty a = new SimpleIntegerProperty();
		IntegerProperty b = new SimpleIntegerProperty();
		
		a.set(13);
		b.set(17);
		
		print(a, b); // a: IntegerProperty [value: 13] | b: IntegerProperty [value: 17]
		
		a.bind(b);   // Initialer Wert wird von b übernommen. Lazy Binding.
		
		print(a, b); // a: IntegerProperty [bound, invalid] | b: IntegerProperty [value: 17]
		
		b.set(42);

		print(a, b); // a: IntegerProperty [bound, invalid] | b: IntegerProperty [value: 42]
		
		a.get();     // Wert wird jetzt berechnet. a wird nun wieder gültig.
		
		print(a, b); // a: IntegerProperty [bound, value: 42] | b: IntegerProperty [value: 42]
		
		a.set(0);    // java.lang.RuntimeException: A bound value cannot be set.
	}

	private static void print(IntegerProperty a, IntegerProperty b) {
		System.out.println("a: " + a + " | " + "b: " + b);
	}
}
