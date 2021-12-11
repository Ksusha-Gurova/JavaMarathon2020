package day14;
//Создать .txt файл в папке проекта, как показано в видео (урок 36, время 15:30).
//        Заполнить его вручную десятью произвольными числами. Реализовать статический
//        метод printSumDigits(File file), который считает сумму всех чисел в этом
//        файле и выводит ее на экран. Вызвать данный метод в методе main().
//        Если файла не существует в папке проекта, в программе необходимо выбрасывать
//        исключение и выводить в консоль сообщение “Файл не найден”. Помимо этого, если
//        чисел в файле меньше или больше 10, необходимо выбрасывать исключение и
//        выводить в консоль сообщение “Некорректный входной файл”.

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {

    static void printSumDigits(File file)  {
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbersString = line.split(" ");
            int[] numbers = new int[numbersString.length];
            if (numbers.length != 10){
                throw new IOException("Некорректный входной файл");
            }
            for (int i = 0; i<numbersString.length; i++){
                numbers[i] = Integer.parseInt(numbersString[i]);
            }
            scanner.close();
            int sum = 0;
            for (int number: numbers){
                sum+=number;
            }
            System.out.println(sum);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }

    public static void main(String[] args) throws FileNotFoundException {
        Task1.printSumDigits(new File("text"));
    }
}
