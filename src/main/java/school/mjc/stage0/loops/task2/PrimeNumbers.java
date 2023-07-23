package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {

        int prime = 2;
        int count = 1;
        int numOfDiv = 0;

        while (count <= prime && prime <= printToInclusive) {
            if (prime % count == 0) {
                numOfDiv++;
            }
            if (count == prime) {
                if (numOfDiv == 2) {
                    System.out.println(prime);
                }
                prime++;
                count = 0;
                numOfDiv = 0;
            }
            count++;

        }
    }
}
