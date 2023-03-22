package Proeftentamen;

import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;

public class BackPane extends FlowPane{
	private final TextField txtField;
	
	public BackPane() {
		txtField = new TextField();
		
		this.setWidth(300);
		this.setHeight(300);
		
		txtField.setPrefWidth(100);
		txtField.setPrefHeight(30);
		txtField.setCenterShape(true);
		txtField.setOnKeyPressed(args -> {
			//guard
			Border border = txtField.getBorder();
			
			if(!args.getCode().equals(KeyCode.ENTER)) {
				return;
			}
			
			this.setBackground(
				new Background(
					new BackgroundFill(
						Color.valueOf(txtField.getText()),
						null, 
						getInsets()
					)
				)
			);
		});
		
		this.getChildren().add(txtField);
	}
}
