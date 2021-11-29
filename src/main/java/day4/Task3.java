package day4;
//Заполнить двумерный массив (матрицу) случайными числами от 0 до 50. Размер
//        матрицы задать m=12, n=8 (m - размерность по строкам, n - размерность по колонкам).
//        В консоль вывести индекс строки, сумма чисел в которой максимальна. Если таких
//        строк несколько, вывести индекс последней из них.
//        Пример сгенерированной матрицы (для простоты m=3, n=5):
//        3 2 1 5 7
//        1 2 5 6 2
//        3 4 9 6 4
// сумма - 18
// сумма - 16
// сумма - 26
//        Ответ: 2 (индекс строки, сумма чисел в которой максимальна)

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
