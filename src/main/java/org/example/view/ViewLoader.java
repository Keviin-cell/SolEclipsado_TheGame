package org.example.view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.util.Objects;

public class ViewLoader {

    public static void show(String fxmlFile, Stage stage) {
        try {
            FXMLLoader loader = new FXMLLoader(ViewLoader.class.getResource(
                    "/fxml/" + fxmlFile));
            Parent root = loader.load();
            stage.setTitle("Sol Eclipsado");
            stage.setScene(new Scene(root));
            stage.getIcons().add(new Image(Objects.requireNonNull(
                    ViewLoader.class.getResourceAsStream("/images/icon-game.png")
            )));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
