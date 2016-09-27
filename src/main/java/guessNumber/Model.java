package guessNumber;

import java.util.Random;

/**
 * Created by Tetiana_Romaniv on 9/15/2016.
 */
public class Model {
    private int value;
    int min =0;
    int max = 100;
    public boolean win = false;

    public Model (){
        value = setValue(this.min, this.max);
    }
    
    public int setValue(int value) {
        return this.value = value;
    }

    public int getMin() {
        return this.min;
    }

    public int getMax() {
        return this.max;
    }

    public int setValue(int min, int max) {
        Random rnd = new Random(System.currentTimeMillis());
        int value = (min-1) + rnd.nextInt(max - min);
        return value;
    }

    public boolean guess (int inputValue){

        if (inputValue == this.value) {
            win = true;
            return win;
        }
        if (inputValue < this.value) {
            this.min = inputValue;
        }else{
            this.max = inputValue;
        }
        return win;
    }
}
