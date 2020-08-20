package org.translator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GuiController {
    private final static Logger log = LogManager.getLogger(GuiController.class);

    @FXML
    private TextArea morseInput;
    @FXML
    private TextArea wordsOutput;

    @FXML
    public void morseToWords(ActionEvent actionEvent) {

        String input = morseInput.getText();
        String output = MorseConverter.translateToWord(input);
        wordsOutput.setText(output);

    }
}