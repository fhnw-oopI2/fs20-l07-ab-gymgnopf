package ch.fhnw.oop2.module07.ab4;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.VBox;

final class ObservableCollection extends VBox {
	
	private ObservableList<String> observableList;
	
	private Button shuffle;
	private ToolBar toolBar;
	private ListView<String> listView;
	
	ObservableCollection() {
		initializeControls();
		layoutControls();
	}
	
	private void initializeControls() {
		String[] names = {"Anna", "Beatrice", "Charles", "Donald"};
		observableList = FXCollections.observableArrayList(names);
		
		shuffle = new Button("Shuffle");
		toolBar = new ToolBar(shuffle);
		
		listView = new ListView<>(observableList);	
	}
	
	private void layoutControls() {
		setPadding(new Insets(20));
		setSpacing(20);
		getChildren().addAll(toolBar, listView);
	}
}
