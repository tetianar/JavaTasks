package game;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Tetiana_Romaniv on 9/27/2016.
 */
public class Game {
    public static void main(String[] args) {
        int min = 0;
        int max = 100;
        int value = setValue();

        guess(min,max,value);
    }

    /**
     * Game guess number from diapazone (min,max)
     * @param min - minimum
     * @param max - maximum
     * @param value - value, that user should guess
     */
    public static void guess(int min, int max, int value ) {
        boolean win = false;
        while (win == false) {
            try {
                System.out.println("Ведите число от " + min + " до " + max);
                Scanner in = new Scanner(System.in);
                int inputValue = in.nextInt();
                if (inputValue >= min && inputValue <= max) {
                    if (inputValue == value) {
                        System.out.println("Вы угадали число! Поздравляем! Вы победили!");
                        win = true;
                    } else if (inputValue <= value) {
                        min = inputValue;
                    } else if (inputValue >= value) {
                        max = inputValue;
                    }
                } else {
                    System.out.println("Вы ввели некорректное число.Попробуйте еще раз");
                }
            } catch (Exception e) {
                System.out.println("Вы ввели неверные данные! Для ввода доступны только целые числа");
            }
        }
    }

    /**
     * //Set value using random function. User indicate min and max. Min, max not including
    */
    private static int setValue(int min, int max) {
        Random rnd = new Random(System.currentTimeMillis());
        int value = min + rnd.nextInt(max - min + 1);
        return value;
    }

    /**
     * //Set value using random function from min to max, not include
     */
    private static int setValue() {
        int min = 0;
        int max = 100;
        Random rnd = new Random(System.currentTimeMillis());
        int value = min + rnd.nextInt(max - min + 1);
        return value;
    }


}


