package thread;

import java.util.Objects;
import java.util.Scanner;

/**
 * Created by Tetiana_Romaniv on 10/6/2016.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 10; i++) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите положительное числo n : ");
            int n = scan.nextInt();
            new Factorial(n).start();
            }
    }

    private static class Factorial extends Thread {
        int n;
        public Factorial (int n){
            this.n = n;
        }

        public void run() {
            if (n<0){
                System.out.println("Неорректный ввод. Введите, пожалуйста положительное число");
            }else if(n==0){
                System.out.println("Факториал числа " + n + " = 0");
            }else {
                try {
                    long fact = calcFactorial(n);
                    synchronized (System.out){
                    System.out.print("Факториал числа " + n + " = " );
                    System.out.println(fact);}
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        private long calcFactorial (int n) throws InterruptedException {
            long result = 1L;
            for (int i = 2; i <= n; i++) {
                result *= i;
                Thread.sleep(1000);
            }
            return result;
        }
    }
}

