package homework.lesson_1;

import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model  = model;
        this.view = view;
    }

    public void activationMethod () {
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        model.setHello(validationForHello(scanner1));
        model.setWorld(validationForWorld(scanner2));

        view.printCorrectPhrase(model.getHello(), model.getWorld());
    }

    public String validationForHello(Scanner scanner) {
        view.printMessage(View.WRITE_HELLO);
        String checker = scanner.nextLine();
        while (!checker.equals(model.getHello())) {
            view.printMessage(View.INCORRECT_WORD);
            checker = scanner.nextLine();
        }
        return checker;
    }

    public String validationForWorld(Scanner scanner) {
        view.printMessage(View.WRITE_WORLD);
        String checker = scanner.nextLine();
        while (!checker.equals(model.getWorld())) {
            view.printMessage(View.INCORRECT_WORD);
            checker = scanner.nextLine();
        }
        return checker;
    }
}
