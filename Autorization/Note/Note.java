/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Autorization.Note;

import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author user
 */
public class Note extends Stage{
    public Note() {
        init();
    }

    private void init() {
        GridPane root = new GridPane();
        root.setHgap(10);
        root.setVgap(10);
        root.setAlignment(Pos.CENTER);
        root.setGridLinesVisible(true);
        
        Label labelTop = new Label("Новая запись");
        root.add(labelTop, 0, 1);
        GridPane.setColumnSpan(labelTop, 3);
        GridPane.setHalignment(labelTop, HPos.CENTER);
        
        TextArea text = new TextArea();
        text.setPrefSize(450, 100);
        root.add(text, 0, 2);
        GridPane.setColumnSpan(text, 3);
        
        Button saveButton = new Button("Сохранить");
        root.add(saveButton, 0, 3);
        GridPane.setHalignment(saveButton, HPos.LEFT);
        Button clearButton = new Button("Очистить");
        root.add(clearButton, 1, 3);
        GridPane.setHalignment(clearButton, HPos.CENTER);
        Button showButton = new Button("Просмотр");
        root.add(showButton, 2, 3);
        GridPane.setHalignment(showButton, HPos.RIGHT);
        
        Scene scene = new Scene(root, 500, 250);
        setTitle("Note");
        setScene(scene);
        show();
    }
}
