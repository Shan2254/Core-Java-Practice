package com.arr.prac;

import java.util.Random;

public class ArrayApp {
    public static void main(String[] args) {
        int[] lottary = new int[5];
        Random randomNumGen = new Random(100);
        lottary[0] = randomNumGen.nextInt(100) + 1;
        lottary[1] = randomNumGen.nextInt(100) + 1;
        lottary[2] = randomNumGen.nextInt(100) + 1;
        lottary[3] = randomNumGen.nextInt(100) + 1;
        lottary[4] = randomNumGen.nextInt(100) + 1;

        for(int number : lottary) {
            System.out.println("Lottery numbers are: " +number);
        }
        int[][] weeklyLotteryNumbers = {
                {1, 2, 3, 4, 5},
                {10, 20, 30, 40, 50},
                {10, 12, 15, 27, 44},
                {44, 55, 66, 77, 88}
        };

        for (int i = 0; i < weeklyLotteryNumbers.length; i++) {
            for (int j = 0; j < weeklyLotteryNumbers[i].length; j++) {
                System.out.print(weeklyLotteryNumbers[i][j] + " ");
            }
            System.out.println();
        }

    }

}
