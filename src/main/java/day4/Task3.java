package day4;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Task3 {
    public static void main(String[] args) {
    int [][] matrix = new int[12][8];
    int[] sumStrings = new int[12];
    int naibolshee = sumStrings[0];
    int numberString = 0;

        for (int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[j].length; j++){
                matrix[i][j] = ThreadLocalRandom.current().nextInt(0,  50+1);
                sumStrings[i] += matrix[i][j];
            }

        }
        System.out.println(Arrays.toString(sumStrings));

        for(int d = 0; d < sumStrings.length; d++){
            if(naibolshee < sumStrings[d]){
                naibolshee = sumStrings[d];
                numberString = d;
            }
        }
        System.out.println("Сумма строки " + numberString + " равна " + naibolshee + " и является наибольшей");

    }
}
