package day4;
//Создать новый массив размера 100 и заполнить его случайными числами из
//        диапазона от 0 до 10000.
//        Затем, используя циклы for each вывести:
//        - наибольший элемент массива
//        - наименьший элемент массива
//        - количество элементов массива, оканчивающихся на 0
//        - сумму элементов массива, оканчивающихся на 0
//        Использовать сортировку запрещено.

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Task2 {
    public static void main(String[] args) {
        int[] massive = new int[100];
        for (int i = 0; i < massive.length; i++) {
            massive[i] = ThreadLocalRandom.current().nextInt(0, 10000 + 1);
        }

        int naibolshee = massive[0];
        int naimenshee = massive[0];
        int zakanchivaetsyNaNol = 0;
        int sumNaNol = 0;

        for(int f:massive){
            if(naibolshee < f){
                naibolshee = f;
            }
            if(naimenshee > f){
                naimenshee = f;
            }
            if(f % 10 == 0){
                zakanchivaetsyNaNol++;
                sumNaNol += f;
            }
        }
        System.out.println(Arrays.toString(massive));
        System.out.println("Наибольший элемент массива равен " + naibolshee);
        System.out.println("Наименьший элемент массива равен " + naimenshee);
        System.out.println("Колличество элементов массива оканчивающихся на 0: " + zakanchivaetsyNaNol);
        System.out.println("Сумма элементов массива оканчивающихся на 0 равна " + sumNaNol);
    }
}
