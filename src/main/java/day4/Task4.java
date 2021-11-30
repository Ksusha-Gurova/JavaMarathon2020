package day4;
//Создать новый массив размера 100 и заполнить его случайными числами из
//        диапазона от 0 до 10000.
//        Найти максимум среди сумм трех соседних элементов. Для найденной тройки с
//        максимальной суммой выведите значение суммы и индекс первого элемента тройки.
//        Пример:
//        *Для простоты пример показан на массиве размера 10
//        [1, 456, 1025, 65, 954, 2789, 4, 8742, 1040, 3254]
//        Тройка с максимальной суммой: [2789, 4, 8742]
//        Вывод в консоль:
//        11535
//        5*Пояснение. Первое число - сумма тройки [2789, 4,

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Task4 {
    public static void main(String[] args) {
        int[] massive = new int[100];
        int index = 0;
        int maxSum = 0;
        for (int i = 0; i < massive.length; i++) {
            massive[i] = ThreadLocalRandom.current().nextInt(0, 10000 + 1);
        }
        for (int i = 0; i < massive.length -2 ; i++) {
            if ((massive[i] + massive[i+1] + massive[i+2]) > maxSum) {
                maxSum = (massive[i] + massive[i+1] + massive[i+2]);
                index = i;
            }
        }
        System.out.println(Arrays.toString(massive));
        System.out.println();
        System.out.println(maxSum);
        System.out.println(index);
    }
}
