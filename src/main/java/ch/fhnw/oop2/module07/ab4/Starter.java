package ch.fhnw.oop2.module07.ab4;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public final class Starter extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		
		final Scene scene = new Scene(new ObservableCollection(), 400, 400);
		
		stage.setScene(scene);
		stage.setResizable(true);
		stage.setTitle("Arbeitsblatt (4)");
		stage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}
