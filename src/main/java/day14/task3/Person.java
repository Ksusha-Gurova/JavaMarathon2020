package day14.task3;
//Создать класс “Человек” с полями “имя” и “возраст”. Реализовать статический метод
//        List<Person> parseFileToObjList(), который считывает содержимое того же
//        файла people.txt, создает экземпляры класса “Человек” и возвращает список
//        объектов. Получить данный список в методе main() и распечатать его в консоль.

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public static List<Person> parseFileToObjList(File file){
        Scanner scanner = null;
        List<Person> people = new ArrayList<>();
        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                String currentLine = scanner.nextLine();
                String[] words = currentLine.split(" ");
                if(Integer.parseInt(words[1]) < 0){
                    throw new IOException();
                }
                people.add(new Person(words[0], Integer.parseInt(words[1])));
            }
            scanner.close();
            return people;

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Некорректный входной файл");
        }
        return null;
    }
}
