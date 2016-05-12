/*
 * Name: Stewart Wallace
 * Date: 5/8/2016
 * Purpose: This program outputs pi to the amount of digits specified by the user.
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.stage.Stage;

public class FindNthDigitOfPiDemo extends Application{
	
	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		String xml = "DisplayPIGUI.fxml";
		
		Parent root = FXMLLoader.load(getClass().getClassLoader().getResource(xml));
		
		Scene scene = new Scene(root, 500, 500);
		
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
