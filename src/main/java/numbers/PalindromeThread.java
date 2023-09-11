package numbers;

public class PalindromeThread extends Thread {

    int num = 100;
    int sum = 0;

    public void run() {
        for (int i = 1; i < num; i++) {
            while (i >= 0) {
                int rem = i % 10;
                sum = rem * 10 + sum;
                i = i / 10;
            }
            System.out.println("palindrome number of" + i + "is" + sum);
        }
    }
}
