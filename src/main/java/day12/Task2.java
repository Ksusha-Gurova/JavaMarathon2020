package day12;
//Создать новый список, заполнить его четными числами от 0 до 30 и от 300 до 350.
//        Вывести список.

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();

        for (int i = 0; i <= 30; i++){
            numbers.add(i);
        }
        for (int i = 300; i <= 350; i++){
            numbers.add(i);
        }
        System.out.println(numbers);
    }
}
