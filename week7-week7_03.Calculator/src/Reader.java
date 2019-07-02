import java.util.*;

public class Reader {
    private Scanner scanner;

    public Reader(){
        this.scanner = new Scanner(System.in);
    }

    public String readString(){
        String input = this.scanner.nextLine();
        return input;
    }

    public int readInteger(){
        int input = Integer.parseInt(scanner.nextLine());
        return input;
    }



}