package Proeftentamen;

import java.io.File;

import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;

public class FilePane extends BorderPane{
	private final TextArea txta;
	
	public FilePane() {
		txta = new TextArea();
		
		ButtonPane pane = new ButtonPane();
		
		pane.setOnMouseClicked(args -> {
			FileChooser fc = new FileChooser();
			fc.setTitle("Openen");
			ExtensionFilter filter = new ExtensionFilter("Text Files (*.txt)", ".txt");
			fc.setSelectedExtensionFilter(null);
			fc.setInitialDirectory(
					new File("C:\\School\\Leerjaar 1\\Eclipse Workspace\\PROG3_OefenTentamen\\textfiles"));
			
//			File file = fc.showOpenDialog()
			
			
		});

		this.getChildren().add(txta);
		this.getChildren().add(pane);
	}
}
