package homework.lesson_2;


import java.util.HashSet;
import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }


    public int gameWithRandomNumber() {
        view.printMessage(View.START);
        Scanner scanner = new Scanner(System.in);
        Integer number;
        HashSet<Integer> tries = new HashSet<>();
        do {
            number = scanner.nextInt();
            model.setAmountOfTries(model.getAmountOfTries() + 1);
            if (number > model.getMin() && number < model.getMax() ) {
                if (tries.contains(number)) {
                    view.printMessage(View.REPETITIVE_VARIABLE);
                }
                tries.add(number);
                if (number.equals(model.getRandomNumber())) {
                    view.printMessage(View.CORRECT_NUMBER);
                } else if (number < model.getRandomNumber()) {
                    view.printMessage(View.MORE);
                } else if (number > model.getRandomNumber()) {
                    view.printMessage(View.LESS);
                }
            } else {
                view.printMessage(View.OUT_OF_BOUND);
            }
        } while (number != model.getRandomNumber());
        System.out.println("Amount of your tries: " + model.getAmountOfTries());
        System.out.println("All of you tries:\n" + tries);
        return number;
    }
}
