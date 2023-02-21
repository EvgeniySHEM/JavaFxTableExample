package com.example.javafxtableexample;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JavaFxTableExample extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Repository repository = new Repository();
        ObservableList<Authors> list = FXCollections.observableArrayList(repository.getAllAuthors());
        TableView<Authors> table = new TableView<>(list);

        TableColumn<Authors, Integer> idAuthor = new TableColumn<>("ID");
        idAuthor.setCellValueFactory(new PropertyValueFactory<>("id"));

        TableColumn<Authors, String> authorName = new TableColumn<>("AUTHOR NAME");
        authorName.setCellValueFactory(new PropertyValueFactory<>("author_name"));

        TableColumn<Authors, String> notes = new TableColumn<>("NOTES");
        notes.setCellValueFactory(new PropertyValueFactory<>("notes"));

        table.getColumns().addAll(idAuthor, authorName, notes);



        StackPane root = new StackPane(table);

        Scene scene = new Scene(root,300, 250);
        stage.setTitle("");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
