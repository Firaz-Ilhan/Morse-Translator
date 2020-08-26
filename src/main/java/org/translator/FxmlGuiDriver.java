package org.translator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FxmlGuiDriver extends Application {

    private static final Logger log = LogManager.getLogger(FxmlGuiDriver.class);

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage stage) throws Exception {

        log.info("Starting the application");

        final String fxmlFile = "/fxml/Gui.fxml";
        log.debug("Loading FXML for main view from: {}", fxmlFile);
        final FXMLLoader loader = new FXMLLoader();
        final Parent rootNode = loader.load(getClass().getResourceAsStream(fxmlFile));

        log.debug("Showing JFX scene");
        final Scene scene = new Scene(rootNode);
        //scene.getStylesheets().add("/styles/styles.css");

        stage.getIcons().add(new Image(FxmlGuiDriver.class.getResourceAsStream("/images/icon.png")));

        stage.setTitle("Morse Translator");
        stage.setScene(scene);
        stage.show();
    }
}
