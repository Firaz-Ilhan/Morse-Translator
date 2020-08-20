package org.translator;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GuiController {
    private final static Logger log = LogManager.getLogger(GuiController.class);

    //Tab: Morse To Words
    @FXML
    private TextArea morseInput;
    @FXML
    private TextArea wordsOutput;

    @FXML
    public void morseToWords() {

        String input = morseInput.getText();
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

        String input = wordsInput.getText();
        String output = MorseConverter.translateToMorse(input);
        morseOutput.setText(output);
    }
}