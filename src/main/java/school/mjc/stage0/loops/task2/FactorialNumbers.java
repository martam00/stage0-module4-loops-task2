package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int multiply = 1;
        int result = 1;
        System.out.println(result);
        while (multiply <= printToInclusive) {
            result *= multiply;
            System.out.println(result);
            multiply++;
        }

    }
}
