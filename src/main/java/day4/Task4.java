package day4;

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
