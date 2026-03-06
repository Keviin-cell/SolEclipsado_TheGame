package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.text.Font;

import java.io.IOException;

import org.example.view.ViewLoader;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        Font font = Font.loadFont(getClass().getResourceAsStream("/fonts/RussoOne-Regular.ttf"), 14);

        ViewLoader.show("menu-view.fxml",stage);
    }

    public static void main(String[] args) {
        launch();
    }
}