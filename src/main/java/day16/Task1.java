package day16;
//    Реализовать программу, которая на вход принимает txt файл с целыми числами
//    (можно использовать файл из задания 1 дня 14) и в качестве ответа выводит в
//    консоль среднее арифметическое этих чисел.
//    Ответ будет являться вещественным числом. В консоль необходимо вывести полную
//    запись вещественного числа (со всеми знаками после запятой) и сокращенную запись
//    (с 3 знаками после запятой).
//    Детали реализации: В классе Task1 создать публичный статический метод
//    printResult(File file), в котором реализовать вышеописанную логику. В методе
//    main() класса Task1 вызвать метод printResult(File file), передав ему в
//    качестве аргумента объект класса
//    File (txt файл с целыми числами).
//    Пример:
//    Числа в txt файле: 5 2 8 34 1 36 77
//    Ответ: 23.285714285714285 --> 23,286

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {

    public static void printResult(File file){
        try (Scanner scanner = new Scanner(file)) {
            String line = scanner.nextLine();
            String[] numbersString = line.split(" ");
            int[] numbers = new int[numbersString.length];
            for(int i = 0; i < numbersString.length; i++){
                numbers[i] = Integer.parseInt(numbersString[i]);
            }
            double sum = 0;
            double average;
            for (int number : numbers) {
                sum += number;
            }
            average = sum/numbers.length;
            System.out.println(average);
            System.out.printf("%.3f", average);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }

    public static void main(String[] args) {
        Task1.printResult(new File("text"));

    }
}
