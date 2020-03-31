package ch.fhnw.oop2.module07.listener;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

/**
 * Diese Klasse implementiert eine Property und folgt den 
 * Nameskonventionen für Property-Klassen. Diese baut auf den
 * Java-Beans Konventionen.
 *
 */
public final class Bill {
	
    private DoubleProperty amountDue = new SimpleDoubleProperty();
    
    /**
     * Default Ctor, öffentlich. Muss vorhanden sein, damit über Reflexion eine
     * Instanz erzeugt werden kann.
     */
    public Bill() {}
 
    /**
     * Getter. Namenskonvention ist Property-Bezeichung mit dem
     * Präfix 'get'.
     * 
     * @return Der Wert der Property (primitive)
     */
    public final double getAmountDue(){
    		return amountDue.get();
    	}
 
    /**
     * Setter. Namenskonvention ist Property-Bezeichung mit dem
     * Präfix 'set'.
     * 
     * @param value Der Wert der Property (primitive) der gesetzt werden soll
     */
    public final void setAmountDue(double value){
    		amountDue.set(value);
    	}
 
    /**
     * Gibt die Property selbst zurück. Die Namenskonvention ist 
     * Property-Bezeichung (amountDue) gefolgt von 'Property'.
     * 
     * @return  Die Property selbst
     */
    public DoubleProperty amountDueProperty() {
    		return amountDue;
    	}
}
