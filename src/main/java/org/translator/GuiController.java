package org.translator;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.net.URL;
import java.util.ResourceBundle;

public class GuiController implements Initializable {
    private final static Logger log = LogManager.getLogger(GuiController.class);

    //Automatic translation
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        morseInput.textProperty().addListener((observable, oldValue, newValue) -> {
            morseToWords();
        });

        wordsInput.textProperty().addListener((observable, oldValue, newValue) -> {
            wordsToMorse();
        });
    }

    //Tab: Morse To Words
    @FXML
    TextArea morseInput;
    @FXML
    TextArea wordsOutput;

    @FXML
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

    @FXML
    public void wordsToMorse() {

        String input = wordsInput.getText().trim();
        String output = MorseConverter.translateToMorse(input);
        morseOutput.setText(output);
    }
}