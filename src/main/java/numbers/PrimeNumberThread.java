package numbers;

public class PrimeNumberThread extends Thread{

    public void run(int n){
        int count =0;
        for (int i=1;i<=n;i++){
            if (n%i == 0){
                count++;
            }
        }
        if (count == 2){
            System.out.println("Prime No");
        }
        else {
            System.out.println("Not prime no");
        }
    }
}
