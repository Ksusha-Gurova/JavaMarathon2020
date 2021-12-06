package day12;
//Создать список строк, добавить в него 5 марок автомобилей, вывести список в
//        консоль. Добавить в середину еще 1 автомобиль, удалить самый первый автомобиль
//        из списка. Распечатать список.

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> car = new ArrayList<String>();
        car.add("Renault");
        car.add("Mitsubishi");
        car.add("Toyota");
        car.add("Suzuki");
        car.add("Volkswagen");

        System.out.println(car);

        car.add(3,"Opel");
        car.remove(0);

        System.out.println(car);
    }
}
