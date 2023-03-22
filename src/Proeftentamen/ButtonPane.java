package Proeftentamen;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;

public class ButtonPane extends FlowPane{
	
	public final Button btn;
	public ButtonPane() {
		this.setHeight(50);
		
		btn = new Button();
		btn.setPrefHeight(30);
		btn.setPrefWidth(80);
		btn.setCenterShape(true);
		btn.setText("Load");
	}
}
