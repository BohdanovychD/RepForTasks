package homework.lesson_2;

import java.util.Random;

public class Model {
    private int min = 0;
    private int max = 100;
    private int amountOfTries = 0;

    Random random = new Random();
    private int randomNumber = random.nextInt(max + 1);

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getRandomNumber() {
        return randomNumber;
    }

    public int getAmountOfTries() {
        return amountOfTries;
    }

    public void setAmountOfTries(int amountOfTries) {
        this.amountOfTries = amountOfTries;
    }
}
