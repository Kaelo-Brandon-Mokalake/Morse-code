/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morse;

import java.util.*;

/**
 *
 * @author Kaelo Mokalake
 */
public class Morse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String message;
        int option;
        
        System.out.print("Enter your preffered option below:\n\t1 - encode a message\n\t2 - decode a message\n\t:");
        option = input.nextInt();
        input.nextLine();
        
        switch (option) {
            case 1 -> {
                System.out.print("Enter your message: ");
                message = input.nextLine().toUpperCase();
                encrypt(message);
            }
            case 2 -> {
                System.out.print("Enter your message: ");
                message = input.nextLine();
                decrypt(message);
            }
            default -> System.out.println("Incorrect input. Try again.");
        }
    }
    
    public static void encrypt(String words){
        
        String[] letters = words.split("");
        
        Map<String, String> code = new HashMap<String, String>(){
        
            {
                // letters
                put("A", ".-");
                put("B", "-...");
                put("C", "-.-.");
                put("D", "-..");
                put("E", ".");
                put("F", "..-.");
                put("G", "--.");
                put("H", "....");
                put("I", "..");
                put("J", ".---");
                put("K", "-.-");
                put("L", ".-..");
                put("M", "--");
                put("N", "-.");
                put("O", "---");
                put("P", ".--.");
                put("Q", "--.-");
                put("R", ".-.");
                put("S", "...");
                put("T", "-");
                put("U", "..-");
                put("V", "...-");
                put("W", ".--");
                put("X", "-..-");
                put("Y", "-.--");
                put("Z", "--..");
                put(" ", " ");
                
                // numbers
                put("0", "-----");
                put("1", ".----");
                put("2", "..---");
                put("3", "...--");
                put("4", "....-");
                put("5", ".....");
                put("6", "-....");
                put("7", "--...");
                put("8", "---..");
                put("9", "----.");
                
                // special characters
                put(".", ".-.-.-");
                put(",", "--..--");
                put("?", "..--..");
                put("'", ".----.");
                put("!", "-.-.--");
                put("/", "-..-.");
                put("(", "-.--.");
                put(")", "-.--.-");
                put("&", ".-...");
                put(":", "---...");
                put(";", "-.-.-.");
                put("=", "-...-");
                put("+", ".-.-.");
                put("-", "-....-");
                put("_", "..--.-");
                put("\"", ".-..-.");
                put("$", "...-..-");
                put("@", ".--.-.");
                
            }
        };
        
        for (String ans : letters) {
            
            System.out.print(code.get(ans));
        }
        System.out.println();

    }
    
    public static void decrypt(String words){
        
        String[] letters = words.split("");
        
        Map<String, String> code = new HashMap<String, String>(){
        
            {
                // letters
                put(".-", "A");
                put("-...", "B");
                put("-.-.", "C");
                put("-..", "D");
                put(".", "E");
                put("..-.", "F");
                put("--.", "G");
                put("....", "H");
                put("..", "I");
                put(".---", "J");
                put("-.-", "K");
                put(".-..", "L");
                put("--", "M");
                put("-.", "N");
                put("---", "O");
                put(".--.", "P");
                put("--.-", "Q");
                put(".-.", "R");
                put("...", "S");
                put("-", "T");
                put("..-", "U");
                put("...-", "V");
                put(".--", "W");
                put("-..-", "X");
                put("-.--", "Y");
                put("--..", "Z");
                put(" ", " 200");
                
                // numbers
                put("-----", "0");
                put(".----", "1");
                put("..---", "2");
                put("...--", "3");
                put("....-", "4");
                put(".....", "5");
                put("-....", "6");
                put("--...", "7");
                put("---..", "8");
                put("----.", "9");
                
                // special characters
                put(".-.-.-", ".");
                put("--..--", ",");
                put("..--..", "?");
                put(".----.", "'");
                put("-.-.--", "!");
                put("-..-.", "/");
                put("-.--.", "(");
                put("-.--.-", ")");
                put(".-...", "&");
                put("---...", ":");
                put("-.-.-.", ";");
                put("-...-", "=");
                put(".-.-.", "+");
                put("-....-", "-");
                put("..--.-", "_");
                put(".-..-.", "\"");
                put("...-..-", "$");
                put(".--.-.", "@");
                
            }
        };
        
        for (String ans : letters) {
            
            System.out.print(code.get(ans));
        }
        System.out.println();

    }
}
