
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
         printWithSmileys("Method");
        // printWithSmileys("Beerbottle");
        // printWithSmileys("Interface");
    }

    private static void printWithSmileys(String characterString) {
        int length = characterString.length();
        String smileys = "";

        for (int i = 0; i < length; i++) {
            smileys += ":)";
        }
        System.out.println(smileys);

        System.out.println(smileys);
    }

}
