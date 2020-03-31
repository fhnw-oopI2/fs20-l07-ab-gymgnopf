package ch.fhnw.oop2.module07.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;

public class ObservableCollection {

	public static void main(String[] args) {
		
		List<String> things = new ArrayList<>(Arrays.asList("A", "B", "C"));
		
		// Erzeugen eines Observable Konstrukts mit Factory Methoden auf FXCollections.
		ObservableList<String> observableThings = FXCollections.observableArrayList(things);
		
		ListChangeListener<String> listener = change -> System.out.println(change);
		
		observableThings.addListener(listener);
		
		System.out.println(observableThings);     // [A, B, C]
		
		observableThings.add("D");                // { [D] added at 3 }
		
		System.out.println(observableThings);     // [A, B, C, D]
		
		observableThings.remove("B");             // { [B] removed at 1 }
		
		FXCollections.reverse(observableThings);  // { [A, C, D] replaced by [D, C, A] at 0 }
		
		System.out.println(observableThings);     // [D, C, A]
		
		things.add("E");                          // Es passiert nichts.
	}
}
