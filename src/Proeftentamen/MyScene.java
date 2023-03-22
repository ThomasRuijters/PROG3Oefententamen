package Proeftentamen;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.Pane;

public class MyScene extends Scene{
	private final MenuBar menubar;
	private Pane currentPane;
	
	public MyScene(Parent root) {
		super(root);
		RootPane rootpane = new RootPane();
		menubar = new MenuBar();
		currentPane = new DrawPane();
		
		menubar.setMinHeight(25);
		
		Menu menu = new Menu();
		menu.setText("Change Pane");
		
		MenuItem drawPaneItem = new MenuItem();
		drawPaneItem.setText("to shape drawing");
		drawPaneItem.setOnAction(args -> {
			menu.getItems().forEach(item -> {
				item.setDisable(false);
			});
			rootpane.getChildren().remove(currentPane);
			currentPane = new DrawPane();
			rootpane.getChildren().add(currentPane);
			((MenuItem)args.getSource()).setDisable(true);
		});
		
		MenuItem backPaneItem = new MenuItem();
		backPaneItem.setText("to background color changer");
		backPaneItem.setOnAction(args -> {
			menu.getItems().forEach(item -> {
				item.setDisable(false);
			});
			rootpane.getChildren().remove(currentPane);
			currentPane = new BackPane();
			rootpane.getChildren().add(currentPane);
			((MenuItem)args.getSource()).setDisable(true);
		});
		
		MenuItem textAreaItem = new MenuItem();
		textAreaItem.setText("to file textarea");
		textAreaItem.setOnAction(args -> {
			menu.getItems().forEach(item -> {
				item.setDisable(false);
			});
			rootpane.getChildren().remove(currentPane);
			currentPane = new FilePane();
			rootpane.getChildren().add(currentPane);
			((MenuItem)args.getSource()).setDisable(true);
		});
		
		menu.getItems().add(drawPaneItem);
		menu.getItems().add(backPaneItem);
		menu.getItems().add(textAreaItem);
		
		menubar.getMenus().add(menu);
		
		rootpane.getChildren().add(menubar);
		rootpane.getChildren().add(currentPane);
		rootpane.setPrefHeight(300);
		rootpane.setPrefHeight(300);
		rootpane.setFillWidth(true);
		
		setRoot(rootpane);
	}
}
