package Proeftentamen;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class DrawPane extends Pane{
	public DrawPane() {
		this.setWidth(300);
		this.setHeight(300);
		
		Rectangle heaven = new Rectangle();
		heaven.setWidth(300);
		heaven.setHeight(125);
		heaven.setY(0);
		heaven.setFill(Color.LIGHTBLUE);
		
		Rectangle ground = new Rectangle();
		ground.setY(126);
		ground.setWidth(300);
		ground.setHeight(125);
		ground.setFill(Color.BEIGE);
		
		Rectangle stump = new Rectangle();
		stump.setWidth(30);
		stump.setHeight(50);
		stump.setX(135);
		stump.setY(210);
		stump.setFill(Color.BROWN);
		
		Circle tree = new Circle();
		tree.setRadius(90);
		tree.setCenterX(150);
		tree.setCenterY(130);
		tree.setFill(Color.GREEN);
		
		this.getChildren().add(heaven);
		this.getChildren().add(ground);
		this.getChildren().add(stump);
		this.getChildren().add(tree);
	}
}
