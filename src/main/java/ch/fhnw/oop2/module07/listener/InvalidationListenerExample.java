package ch.fhnw.oop2.module07.listener;

import javafx.beans.binding.NumberBinding;

public class InvalidationListenerExample {

	public static void main(String[] args) {
		
		Bill bill1 = new Bill();
        Bill bill2 = new Bill();
        
        // Lazy addieren von zwei 'Zahlen' (Properties).
        NumberBinding total = bill1.amountDueProperty().add(bill2.amountDueProperty());
        
        // InvalidationListener auf Binding registrieren.
        // Observable kapselt den Wert nicht.
        total.addListener(observable -> System.out.println(observable));
        
        // Macht das bisher gültige Binding ungültig. Listener wird notifiziert.
        bill1.setAmountDue(200.00);
        
        // Binding ist ungültig, es wird kein Listener mehr aufgerufen.
        bill2.setAmountDue(100.00);
        
        // Jetzt wird der Wert via Binding berechnet. 
        // Das Binding wird wieder gültig (valid).
        System.out.println(total.getValue());
        
        // Durch das Setzen wird es wieder ungültig.
        bill1.setAmountDue(150.00);
        
        // ... bleibt ungültig ...
        bill2.setAmountDue(250.00);
       
        // ... und wird wieder gültig.
        System.out.println(total.getValue());
	}
}
