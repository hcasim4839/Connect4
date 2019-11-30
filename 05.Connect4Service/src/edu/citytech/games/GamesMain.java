package edu.citytech.games;

import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GamesMain extends Application {

	public static void main(String[] args) {
		Application.launch(GamesMain.class, args);

	}

	@Override
	public void start(Stage stage) throws Exception {
		
		Parent root = FXMLLoader.load(getClass().getResource("Connect4.fxml"));
		
		stage.setTitle("Connect 4");
		
		Scene scene = new Scene(root);
		stage.setScene(scene);
		
		URL url = this.getClass().getResource("Connect4.css");
		if (url == null) {
			System.out.println("Resource not found. Aborting.");
			System.exit(-1);
		}
		
		String css = url.toExternalForm();
		scene.getStylesheets().add(css);
		stage.show();
	}

}
