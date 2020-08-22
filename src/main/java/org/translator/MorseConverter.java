package org.translator;

public class MorseConverter {

    /**
     * Encodes a single character to morse code
     *
     * @param x single character
     * @return morse code
     */
    private static String morseEncode(char x) {

        x = Character.toLowerCase(x);
        return switch (x) {
            case 'a' -> ".-";
            case 'ä' -> ".-.-";
            case 'á' -> ".--.-";
            case 'b' -> "-...";
            case 'c' -> "-.-.";
            case 'd' -> "-..";
            case 'e' -> ".";
            case 'f' -> "..-.";
            case 'g' -> "--.";
            case 'h' -> "....";
            case 'i' -> "..";
            case 'j' -> ".---";
            case 'k' -> "-.-";
            case 'l' -> ".-..";
            case 'm' -> "--";
            case 'n' -> "-.";
            case 'o' -> "---";
            case 'ö' -> "---.";
            case 'p' -> ".--.";
            case 'q' -> "--.-";
            case 'r' -> ".-.";
            case 's' -> "...";
            case 'ß' -> "...--..";
            case 't' -> "-";
            case 'u' -> "..-";
            case 'ü' -> "..--";
            case 'v' -> "...-";
            case 'w' -> ".--";
            case 'x' -> "-..-";
            case 'y' -> "-.--";
            case 'z' -> "--..";
            case '0' -> "-----";
            case '1' -> ".----";
            case '2' -> "..---";
            case '3' -> "...--";
            case '4' -> "....-";
            case '5' -> ".....";
            case '6' -> "-....";
            case '7' -> "--...";
            case '8' -> "---..";
            case '9' -> "----.";
            case ' ' -> "/";

            default -> "?";
        };
    }

    /**
     * Decodes morse to a single character
     *
     * @param morse morse code
     * @return single character
     */
    private static String morseDecode(String morse) {

        return switch (morse) {
            case ".-" -> "a";
            case ".-.-" -> "ä";
            case ".--.-" -> "á";
            case "-..." -> "b";
            case "-.-." -> "c";
            case "-.." -> "d";
            case "." -> "e";
            case "..-." -> "f";
            case "--." -> "g";
            case "...." -> "h";
            case ".." -> "i";
            case ".---" -> "j";
            case "-.-" -> "k";
            case ".-.." -> "l";
            case "--" -> "m";
            case "-." -> "n";
            case "---" -> "o";
            case "---." -> "ö";
            case ".--." -> "p";
            case "--.-" -> "q";
            case ".-." -> "r";
            case "...--.." -> "ß";
            case "..." -> "s";
            case "-" -> "t";
            case "..-" -> "u";
            case "..--" -> "ü";
            case "...-" -> "v";
            case ".--" -> "w";
            case "-..-" -> "x";
            case "-.--" -> "y";
            case "--.." -> "z";
            case "-----" -> "0";
            case ".----" -> "1";
            case "..---" -> "2";
            case "...--" -> "3";
            case "....-" -> "4";
            case "....." -> "5";
            case "-...." -> "6";
            case "--..." -> "7";
            case "---.." -> "8";
            case "----." -> "9";
            case "/" -> " ";

            default -> "?";
        };

    }

    /**
     * translates words to morse
     *
     * @param word the word(s) to be translated
     * @return morse code for requested words
     */
    public static String translateToMorse(String word) {

        StringBuilder result = new StringBuilder(20);

        for (int i = 0; i < word.length(); i++) {
            result.append(morseEncode(word.charAt(i)));
            result.append(" ");
        }

        return result.toString().trim();
    }

    /**
     * translates morse to words
     *
     * @param morse the morse code to be translated
     * @return word(s) for requested morse code
     */
    public static String translateToWord(String morse) {

        StringBuilder result = new StringBuilder(20);

        String[] s1 = morse.split(" ");

        for (String s : s1) {
            result.append(morseDecode(s));
        }
        return result.toString();
    }

}
