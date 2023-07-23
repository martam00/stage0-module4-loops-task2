package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive) {
        int even = 0;
        while (even <= printTillInclusive) {
            System.out.println(even);
            even += 2;
        }
    }
}
