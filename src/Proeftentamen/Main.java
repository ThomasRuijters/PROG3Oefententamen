package Proeftentamen;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.stage.Stage;

public class Main extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("PROG3 Oefentoets");
		
		MyScene scene = new MyScene(new Parent() {
			
		});
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
