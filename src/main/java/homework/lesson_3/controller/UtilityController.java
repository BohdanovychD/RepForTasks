package homework.lesson_3.controller;

import homework.lesson_3.view.View;

import java.util.Scanner;

public class UtilityController {
    private Scanner scanner;
    private View view;

    public UtilityController(Scanner scanner, View view) {
        this.scanner = scanner;
        this.view = view;
    }

    String inputChecker(String message, String regex) {
        String checker;
        view.printStringInput(message);
        while( !(scanner.hasNext() && (checker = scanner.next()).matches(regex))) {
            view.printWrongStringInput(message);
        }
        return checker;
    }
}
