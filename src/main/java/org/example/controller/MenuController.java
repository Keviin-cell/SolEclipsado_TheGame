package org.example.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuController {



    @FXML
    public void changeScene(ActionEvent event) {
        try {
            // Obtener el botón que disparó el evento y su ID
            String buttonId = ((Button) event.getSource()).getId();

            // Generar automáticamente el nombre del archivo FXML basado en el ID del botón
            String fxmlFile = buttonId.replace("Button", "-view.fxml");

            // Cargar la nueva escena
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/" + fxmlFile));
            Parent newScene = loader.load();

            // Obtener la ventana actual (Stage) y cambiar la escena
            Stage stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(newScene));
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
