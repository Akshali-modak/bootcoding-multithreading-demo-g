package numbers;

public class FibonacciThread extends Thread {
    //    public   void  run(){
//        int n = 10;
//        int a = 0;
//        int b = 1;
//        int add;
//        System.out.println(n);
//        for (int i =1; i<=n; i++){
//            System.out.println(+a);
//            add = a + b;
//            a = b;
//            b = add;
//        }
//    }
    int p1 = 1;
    int p2 = 1;
    int sum = 1;

    public void run() {
//        int res[]=new int[10];
        for (int i = 1; i <= 10; i++) {
            p2 = p1;
            p1 = sum;
            sum = p1 + p2;
//            res[i-1]=sum;
            System.out.println("fibo number is :-" + sum);
        }

    }
}