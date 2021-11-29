package day2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Введите число ;)");
        Scanner input = new Scanner(System.in);

        double x = input.nextDouble();
        if (x >= 5) {
            System.out.println("y = " + (Math.pow(x, 2) - 10)/(x + 7));
        }
        else if (x > -3) {
            System.out.println("y = " + (x + 3) * (Math.pow(x, 2) - 2));
        }
        else System.out.println("y = 420");

    }
}
