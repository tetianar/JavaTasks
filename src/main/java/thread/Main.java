package thread;

import java.util.Objects;
import java.util.Scanner;

/**
 * Created by Tetiana_Romaniv on 10/6/2016.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {

        Object loa = new Object();
        synchronized (loa){
        for (int i = 0; i < 10; i++) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите положительное числo n : ");
            int n = scan.nextInt();
            new Factorial(n).start();
            }
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
                System.out.println("Факториал числа " + n + " = " + calcFactorial(n));
            }
        }

        private synchronized long calcFactorial (int n){
            long result = 1L;
            for (int i = 2; i <= n; i++) {
                result *= i;
            }
            return result;
        }
    }
}

