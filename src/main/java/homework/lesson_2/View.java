package homework.lesson_2;

public class View {
    public static final String START = "Let's start a game. Can u guess a secret number?\nWrite " +
            "a number from 0 to 100:" ;
    public static final String MORE = "Random number is more than yours. Please, try again.";
    public static final String LESS = "Random number is less than yours. Please, try again.";
    public static final String CORRECT_NUMBER = "You have written a correct number. Congratulation!";
    public static final String OUT_OF_BOUND = "Your number is out of bound. Write a number from 0 to 100:";
    public static final String REPETITIVE_VARIABLE = "You have already written this number.";

    public void printMessage(String message) {
        System.out.println(message);
    }
}
