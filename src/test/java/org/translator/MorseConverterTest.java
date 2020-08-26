package org.translator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MorseConverterTest {

    @Test
    void translateToMorse() {
        Assertions.assertEquals(".... . .-.. .-.. ---", MorseConverter.translateToMorse("hello"));
        Assertions.assertEquals("-.-. .- ..-. .-..-", MorseConverter.translateToMorse("cafè"));
        Assertions.assertEquals(".-.. --- .-. . -- / .. .--. ... ..- -- / -.. --- .-.. --- .-. / ... .. - / .- -- . -",
                MorseConverter.translateToMorse("Lorem ipsum dolor sit amet"));
        Assertions.assertEquals(".---- ..--- ...-- ....- ..... -.... --... ---.. ----. -----",
                MorseConverter.translateToMorse("1234567890"));
        Assertions.assertNotEquals("####", MorseConverter.translateToMorse("äöüß"));
    }

    @Test
    void translateToWord() {
        Assertions.assertEquals("morse code",
                MorseConverter.translateToWord("-- --- .-. ... . / -.-. --- -.. ."));
        Assertions.assertEquals("1234567890",
                MorseConverter.translateToWord(".---- ..--- ...-- ....- ..... -.... --... ---.. ----. -----"));
        Assertions.assertEquals("äüöß!?",
                MorseConverter.translateToWord(".-.- ..-- ---. ...--.. -.-.-- ..--.."));
        Assertions.assertNotEquals("abcdefg",
                MorseConverter.translateToWord(".- -... -.. . ..-. --."));
    }
}