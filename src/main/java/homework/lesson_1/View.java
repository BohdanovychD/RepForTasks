package homework.lesson_1;

public class View {
    public static final String WRITE_HELLO = "Write word \"Hello\": ";
    public static final String WRITE_WORLD = "Write word \"world!\": ";
    public static final String INCORRECT_WORD = "You wrote an incorrect word! Please, try again";

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printCorrectPhrase(String first, String second) {
        System.out.println(first + " " + second);
    }
}
