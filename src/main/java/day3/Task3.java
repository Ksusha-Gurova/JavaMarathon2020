package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        double one;

        Scanner scanner2 = new Scanner(System.in);
        double two = 1.0;

        for (int i = 0; i < 5; i++){
            System.out.println("Введите первое число");
            one = scanner1.nextDouble();
            System.out.println("Введите второе число");
            two = scanner2.nextDouble();
            if(two == 0){
                System.out.println("Деление на ноль");
                continue;
            }
            System.out.println("Результат деления первого числа на второе равен " + one/two);
        }
    }
}
