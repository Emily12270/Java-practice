package test2;

import java.util.Random;
import java.util.Scanner;

// 猜數字
public class NumberGuessingGame {

    public static void main(String[] args) {
        Random random = new Random();
        int targetNumber = random.nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);
        int guess;

        do {
            System.out.print("猜一個數字 (1-100): ");
            guess = scanner.nextInt();

            if (guess > targetNumber) {
                System.out.println("太大了，再試一次！");
            } else if (guess < targetNumber) {
                System.out.println("太小了，再試一次！");
            } else {
                System.out.println("恭喜你，猜對了！");
            }
        } while (guess != targetNumber);
    }
}