package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int multiply = 0;
        int counter = 0;
        if (multiplyByAndToInclusive == 0) {
            return;
        }
        int maxNum = multiplyByAndToInclusive;
        if (multiplyByAndToInclusive < 0) {
            maxNum = multiplyByAndToInclusive * -1;
        }
        while (counter <= maxNum) {
            System.out.println(multiply);
            counter++;
            multiply = counter * multiplyByAndToInclusive;
        }
    }
}
