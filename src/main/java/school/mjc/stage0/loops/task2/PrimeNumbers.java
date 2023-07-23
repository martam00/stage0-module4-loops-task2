package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {

        int prime = 2;
        int counter = 1;
        int numOfDiv = 0;

        while (counter <= prime && prime <= printToInclusive) {
            if (prime % counter == 0) {
                numOfDiv++;
            }
            if (counter == prime) {
                if (numOfDiv == 2) {
                    System.out.println(prime);
                }
                prime++;
                counter = 0;
                numOfDiv = 0;
            }
            counter++;

        }
    }
}
