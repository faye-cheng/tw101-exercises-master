package com.thoughtworks.tw101.exercises.exercise7;

// Write a program that chooses a random number between 1 and 100. Then asks the user to enter a guess. If they guess
// right then tell them they win, otherwise tell them if they guessed too high or low. Keep asking the user to guess
// until they get the right answer. Use classes to separate the different concerns of this program.
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random randomNumber = new Random();
        int n = randomNumber.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Guess a number between 1 and 100:\t");
        int guess = scanner.nextInt();

        while (guess < 1 || guess > 100) {
            System.out.println("Invalid input.");
            System.out.print("Guess a number between 1 and 100:\t");
            guess = scanner.nextInt();
        }

        while ((guess != n)) {
            if (guess < n) {
                System.out.println("Your guess is too low.");
            } else {
                System.out.println("Your guess is too high.");
            }
            System.out.print("Guess again:\t");
            guess = scanner.nextInt();
        }
        System.out.println("YOU GUESSED CORRECT! The number was " + n +".");
    }
}
