package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Укажите любое целое число");
        Scanner one = new Scanner(System.in);
        int one1 = one.nextInt();

        System.out.println("Укажите еще одно целое число");
        Scanner two = new Scanner(System.in);
        int two2 = two.nextInt();

        if(two2 <= one1) {
            System.out.println("Некорректный ввод");
        }

        int i = one1;
        while(i < two2){
            if(i % 5 == 0 && i % 10 != 0 ) {
                System.out.println(i);
            }
            i++;
        }
    }
}
  /*System.out.println("Укажите любое целое число");
          Scanner one = new Scanner(System.in);
          int one1 = one.nextInt();

          System.out.println("Укажите еще одно целое число");
          Scanner two = new Scanner(System.in);
          int two2 = two.nextInt();

          if(two2 <= one1){
          System.out.println("Некорректный ввод");
          }

          for (int i = one1 + 1; i < two2; i++){
        if(i % 5 == 0 && i % 10 != 0 ){
        System.out.println(i);*/