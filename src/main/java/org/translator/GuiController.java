package org.translator;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.net.URL;
import java.util.ResourceBundle;

public class GuiController implements Initializable {
    private final static Logger log = LogManager.getLogger(GuiController.class);

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        morseInput.textProperty().addListener((observable, oldValue, newValue) -> {
            morseToWords();
        });

        wordsInput.textProperty().addListener((observable, oldValue, newValue) -> {
            wordsToMorse();
        });

        aboutIcon.setImage(new Image("/images/icon.png"));

        String osName = System.getProperty("os.name");
        String osArch = System.getProperty("os.arch");
        String javaVersion = System.getProperty("java.version");
        String javafxVersion = System.getProperty("javafx.version");
        versionArea.setText("Operating System: " + osName + ' ' + osArch + '\n'
                + "Java runtime version: " + javaVersion + '\n'
                + "JavaFX version: " + javafxVersion + '\n' + '\n'
                + "Morse Translator version: 1.0.3" + '\n'
                + "https://github.com/Firaz-Ilhan/Morse-Translator");
    }

    //Tab: Morse To Words
    @FXML
    private TextArea morseInput;
    @FXML
    private TextArea wordsOutput;

    public void morseToWords() {

        String input = morseInput.getText().trim();
        String output = MorseConverter.translateToWord(input);
        wordsOutput.setText(output);
    }

    //Tab: Words To Morse
    @FXML
    private TextArea wordsInput;
    @FXML
    private TextArea morseOutput;

    public void wordsToMorse() {

        String input = wordsInput.getText();
        String output = MorseConverter.translateToMorse(input);
        morseOutput.setText(output);
    }

    //Tab: About
    @FXML
    private ImageView aboutIcon;
    @FXML
    private TextArea versionArea;
}