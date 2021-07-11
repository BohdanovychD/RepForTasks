package homework.lesson_3.controller;


import homework.lesson_3.exception.LoginExistException;
import homework.lesson_3.model.UniqueChecker;
import homework.lesson_3.view.View;
import homework.lesson_3.model.Model;

import java.util.Scanner;

public class Controller {
    private View view;
    private Model model;


    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        Notebook notebook = new Notebook(scanner, view);
        notebook.inputNote();

        UniqueChecker uniqueChecker = getUniqueChecker(notebook);
        System.out.println(uniqueChecker);
    }

    private UniqueChecker getUniqueChecker(Notebook notebook) {
        UniqueChecker uniqueChecker = null;
        while (true) {
            try {
                uniqueChecker = new UniqueChecker(notebook.getName(), notebook.getLogin());
                break;
            } catch (LoginExistException e) {
                e.printStackTrace();
                System.out.println("Not unique login " + e.getLogin());
                notebook.inputNote();
            }
        }
        return uniqueChecker;
    }


}
