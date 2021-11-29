package day4;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите размер массива");
        int n = scanner.nextInt();
        int[] massiv = new int[n];

        int bolshe8 = 0;
        int ravno1 = 0;
        int chetnoe = 0;
        int nechetnoe = 0;
        int sum = 0;

        for (int i = 0; i < massiv.length; i++){
            massiv[i] = ThreadLocalRandom.current().nextInt(0,  10+1);
            if (massiv[i] > 8) {
                bolshe8++;
            }
            if(massiv[i] == 1){
                ravno1++;
            }

            if (massiv[i] %2 == 0){
                chetnoe++;
            }
            if (massiv[i] %2 != 0){
                nechetnoe++;
            }
            sum += massiv[i];
        }
        System.out.println("Введено число " + n + ". Сгенерирован следующий массив: ");
        System.out.println(Arrays.toString(massiv));

        System.out.println("Длинна массива: " + n);
        System.out.println("Колличество чисел больше 8: " + bolshe8);
        System.out.println("Колличество чисел равных 1: " + ravno1);
        System.out.println("Колличество четных чисел: " + chetnoe);
        System.out.println("Колличество нечетных чисел: " + nechetnoe);
        System.out.println("Сумма всех элементов массива: " + sum);
    }
}
