package arithmAndPosOfVal;

public class PositionsOfValue {
    public int[] search (int[] arrayValues, int value){
        int count = 0;
        int [] outArray = {};
        for (int i = 0; i < arrayValues.length; i++) {
            if (arrayValues[i] == value) {
                count += 1;
            }
        }
        if (count != 0){
            outArray = new int [count];
            int k=0;
            for (int j = 0; j < arrayValues.length; j++){
                if(arrayValues[j] == value){
                    outArray[k]=j;
                    k +=1;

                }
            }
        }
        return outArray;

    }

}
