package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive) {
        int evenNum = 0;
        while (evenNum <= printTillInclusive) {
            System.out.println(evenNum);
            evenNum += 2;
        }
    }
}
