package homework.lesson_3.controller;

import homework.lesson_3.View;

import java.util.Scanner;

public class Notebook implements Regexes {
    private Scanner scanner;
    private View view;

    private String name;
    private String login;

    public Notebook(Scanner scanner, View view) {
        this.scanner = scanner;
        this.view = view;
    }

    public void inputNote() {
        UtilityController utilityController = new UtilityController(scanner, view);
        String value = (String.valueOf(View.bundle.getLocale()).equals("ua"))
                ? REGEX_NAME_UKR : REGEX_NAME_LAT;
        this.name = utilityController.inputChecker(View.NAME_INPUT, value);
        this.login = utilityController.inputChecker(View.LOGIN_INPUT, REGEX_LOGIN);

    }
}
