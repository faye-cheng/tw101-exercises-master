package com.thoughtworks.tw101.exercises.exercise8;

// Exercise #8: Create a new version of Exercise #7 where you also record all of the user’s guesses and print them out
// once they guess correctly. Use an ArrayList to store the guesses. Catch the NumberFormatException and handle the case
// where the user entered a String that is not parseable.

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args) {
        Random randomNumber = new Random();
        int n = randomNumber.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> userGuessList = new ArrayList<Integer>();

        System.out.print("Guess a number between 1 and 100:\t");
        String line = scanner.nextLine();
        int guess;
        while(true) {
            try {
                guess = Integer.parseInt(line);
                break;
            }
            catch (NumberFormatException e) {
                // do nothing
            }
            System.out.println(">>Error! Not a valid input. Guess again:\t");
            line = scanner.nextLine();
        }

        while (guess < 1 || guess > 100) {
            System.out.println(">>Error! Out of bounds.");
            System.out.print("Guess a number between 1 and 100:\t");
            guess = Integer.parseInt(scanner.nextLine());
            userGuessList.add(guess);
        }

        while ((guess != n)) {
            if (guess < n) {
                System.out.println("Your guess is too low.");
            } else {
                System.out.println("Your guess is too high.");
            }
            System.out.print("Guess again:\t");
            guess = scanner.nextInt();
            userGuessList.add(guess);
        }
        System.out.println("YOU GUESSED CORRECT! The number was " + n +".");
        System.out.println("Your guesses:");

        for(int userGuess : userGuessList) {
            System.out.print(userGuess + " ");
        }
    }
}

