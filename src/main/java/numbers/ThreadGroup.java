package numbers;

import numbers.FibonacciThread;
import numbers.PalindromeThread;
import numbers.PrimeNumberThread;

public class ThreadGroup {
    public static void main(String[] args) {
        Thread t1 = new PalindromeThread();
        t1.start();

        Thread t2 = new PrimeNumberThread();
        t2.start();

        Thread t3 = new FibonacciThread();
        t3.start();
    }
}
