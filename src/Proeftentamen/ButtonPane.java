package Proeftentamen;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;

public class ButtonPane extends FlowPane{
	
	public final Button btn;
	public ButtonPane() {
		this.setPrefSize(300, 50);
		
		btn = new Button();
		btn.setPrefHeight(30);
		btn.setPrefWidth(80);
		btn.setCenterShape(true);
		btn.setText("Load");
		
		this.getChildren().add(btn);
		this.setAlignment(Pos.CENTER);
	}
}
