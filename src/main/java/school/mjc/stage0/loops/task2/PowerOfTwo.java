package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if (power < 0) {
            System.out.println("too much power");
        } else {
            int pow = 0;
            int numTwo = 2;
            while (pow <= power) {
                System.out.println((int)Math.pow(numTwo, pow));
                pow++;
            }
        }

    }
}
