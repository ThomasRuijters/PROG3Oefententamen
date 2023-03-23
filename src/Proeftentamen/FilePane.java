package Proeftentamen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javafx.scene.control.TextArea;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;

public class FilePane extends BorderPane{
	private final TextArea txta;
	
	public FilePane() {
		txta = new TextArea();
		
		this.setBackground(new Background(new BackgroundFill(Color.RED, null, null)));
		this.setPrefSize(300, 300);

		ButtonPane pane = new ButtonPane();

		this.setCenter(txta);
		this.setBottom(pane);
		
		pane.setOnMouseClicked(args -> {
			FileChooser fc = new FileChooser();
			fc.setTitle("Openen");
			ExtensionFilter filter = new ExtensionFilter("Text Files (*.txt)", ".txt");
			fc.setSelectedExtensionFilter(null);
			fc.setInitialDirectory(
				new File("C:\\School\\Leerjaar 1\\Eclipse Workspace\\PROG3_OefenTentamen\\textfiles"));
			
			File file = null;
//			file = fc.showOpenDialog()
			
			// Try with resource, the using(resource) of Java
			try(Scanner scanner = new Scanner(file)){
				StringBuilder builder = new StringBuilder();
				
				while(scanner.hasNext()) {
					builder.append(scanner.nextLine());
				}
				
				this.txta.setText(builder.toString());
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
	}
}
