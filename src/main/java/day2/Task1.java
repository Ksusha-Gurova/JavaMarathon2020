package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Укажите колличество этажей в доме.");
        Scanner flor = new Scanner(System.in);
        int input = flor.nextInt();

        if (input>0 && input<=4) {
            System.out.println("Малоэтажный дом");
        }else if (input >= 5 && input <= 8){
            System.out.println("Среднеэтажный дом");
        }
        else if(input>=9){
            System.out.println("Многоэтажный дом");
        }
        else if(input<=0){
            System.out.println("Ошибка ввода");
        }
    }
}