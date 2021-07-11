package homework.lesson_3.view;

import java.util.Locale;
import java.util.ResourceBundle;

public class View {
    public static final String REGISTRATION = "input.registration.data";
    public static final String NAME_INPUT = "input.name.data";
    public static final String LOGIN_INPUT = "input.login.data";
    public static final String WRONG_INPUT = "input.wrong.data";

    static String MESSAGES_BUNDLE_NAME = "messages";
    public static final ResourceBundle bundle = ResourceBundle.getBundle(MESSAGES_BUNDLE_NAME,
            new Locale("ua", "UA"));
 //             new Locale("en"));


    public void printMessage(String message) {
        System.out.println(message);
    }

    public String concatenationString(String... message) {
        StringBuilder concatString = new StringBuilder();
        for (String v : message) {
            concatString = concatString.append(v);
        }
        return new String(concatString);
    }

    public void printStringInput(String message) {
        printMessage(concatenationString(
                bundle.getString(REGISTRATION),
                bundle.getString(message)));
    }

    public void printWrongStringInput(String message) {
        printMessage(concatenationString(
                bundle.getString(WRONG_INPUT),
                bundle.getString(message)));
    }

}
