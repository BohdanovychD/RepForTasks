package homework.lesson_3;

import homework.lesson_3.controller.Controller;
import homework.lesson_3.model.Model;
import homework.lesson_3.view.View;

public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);

        controller.execute();

    }
}
