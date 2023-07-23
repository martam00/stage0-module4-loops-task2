package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int multiplier = 1;
        int result = 1;
        System.out.println(result);
        while (multiplier <= printToInclusive) {
            result *= multiplier;
            System.out.println(result);
            multiplier++;
        }

    }
}
