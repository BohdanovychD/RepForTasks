package homework.lesson_3;

import homework.lesson_3.controller.Controller;
import homework.lesson_3.model.Model;

public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);

        controller.execute();
    }
}
