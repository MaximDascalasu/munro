import java.util.Scanner;

public class InputHelper {
    private final Scanner reader;
    public InputHelper() {reader= new Scanner(System.in);}

    //read character
    public  char readCharacter(String prompt){
        System.out.println(prompt +"-");
        char inputText=reader.nextLine().charAt(0);
    return inputText;
    }

    public char readCharacter( String prompt, String s) {
    char inputText;
    boolean inputError;
    do {
        inputError = false;
        System.out.println(prompt + ": ");
        inputText = reader.nextLine().toUpperCase().charAt(0);
        if (s.indexOf(inputText) == -1) {
            inputError = true;
            System.out.println("Character out of range: please re-enter: ");
        }
    } while (inputError);
        return inputText;
    }
    }

