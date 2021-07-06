package homework.lesson_3.controller;


import homework.lesson_3.View;
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
    }


}
