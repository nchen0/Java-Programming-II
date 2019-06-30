import java.util.Scanner;

public class TextUserInterface {
    private Scanner input;
    private Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.input = reader;
        this.dictionary = dictionary;
    }

    public void start() {
        System.out.println("Statements: ");
        System.out.println("  add - adds a word pair to the dictionary");
        System.out.println("  translate - asks a word and prints its translation");
        System.out.println("  quit - quits the text user interface");

        while (true) {
            System.out.println("Statement: ");
            String words = input.nextLine();

            if (words.equals("quit")) {
                quit();
                break;
            } else if (words.equals("add")) {
                add();
            } else if (words.equals("translate")) {
                translate();
            }

        }

    }

    public void quit() {
        System.out.println("Cheers!");
    }

    public void add() {
        System.out.println("In Finnish: ");
        String key = input.nextLine();
        System.out.println("Translation: ");
        String value = input.nextLine();
        dictionary.add(key, value);
        System.out.println("");
    }

    public void translate() {
        System.out.println("Give a word: ");
        String given = input.nextLine();
        System.out.println("Translation: " + dictionary.translate(given));
        System.out.println("");
    }
}
