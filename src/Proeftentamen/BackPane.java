package Proeftentamen;

import javafx.geometry.Pos;
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
		this.setAlignment(Pos.CENTER);
		
		this.setWidth(300);
		this.setMinHeight(300);
		this.setBackground(
			new Background(
				new BackgroundFill(
					Color.RED,
					null, 
					getInsets()
				)
			)
		);
		
		txtField.setPrefWidth(100);
		txtField.setPrefHeight(30);

		this.getChildren().add(txtField);
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
	}
}
