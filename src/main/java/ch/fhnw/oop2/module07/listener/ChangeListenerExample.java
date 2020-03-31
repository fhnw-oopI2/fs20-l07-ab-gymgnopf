package ch.fhnw.oop2.module07.listener;

import javafx.beans.binding.NumberBinding;

public class ChangeListenerExample {

	public static void main(String[] args) {
		
		Bill bill1 = new Bill();
        Bill bill2 = new Bill();
        
        // Lazy addieren von zwei 'Zahlen' (Properties).
        NumberBinding total = bill1.amountDueProperty().add(bill2.amountDueProperty());
        
        // ChangeListener auf Binding registrieren. Das erzwingt nun Eager-Computation.
        // ObservableValue kapselt den Wert..
        total.addListener((observableValue, oldValue, newValue) 
        		-> System.out.println(observableValue.getValue() + " | " + oldValue + " | " + newValue));
        
        bill1.setAmountDue(200.00);
        bill2.setAmountDue(100.00);
        
        System.out.println("getValue() - " + total.getValue());
        
        bill1.setAmountDue(150.00);
        bill2.setAmountDue(250.00);
       
        System.out.println("getValue() - " + total.getValue());
	}
}
