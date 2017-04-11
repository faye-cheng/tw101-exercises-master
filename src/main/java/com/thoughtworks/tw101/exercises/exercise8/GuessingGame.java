package com.thoughtworks.tw101.exercises.exercise8;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by fayecheng on 4/10/17.
 */
public class GuessingGame {

    Scanner scanner = new Scanner(System.in);
    ArrayList<Integer> userGuessList = new ArrayList<Integer>();
    Random randomNumber = new Random();
    int n = randomNumber.nextInt(100) + 1;
    int guess;

    public void beginGame() {
        promptUserForGuess();
    }

    private void promptUserForGuess() {
        System.out.print("Guess a number between 1 and 100:\t");
        checkForValidInput(scanner.nextLine());
    }

    private void checkForValidInput(String line) {
        while (true) {
            try {
                guess = Integer.parseInt(line);
            }
            catch (NumberFormatException e) {
                System.out.println(">>Error! Not a valid input.");
                promptUserForGuess();
            }
            checkForOutOfBounds(guess);
        }
    }

    private void checkForOutOfBounds(int guess) {
        this.guess = guess;
        while (guess < 1 || guess > 100) {
            System.out.println(">>Error! Out of bounds.");
            promptUserForGuess();
        }
        processGuess(guess);
    }

    private void processGuess(int guess) {
        userGuessList.add(guess);
        if(guess != n) {
            if (guess < n) {
                System.out.println("Your guess is too low.");
                promptUserForGuess();
            } else {
                System.out.println("Your guess is too high.");
                promptUserForGuess();
            }
        } else {
            System.out.println("YOU GUESSED CORRECT! The number was " + n + ".");
            System.out.println("Your guesses:");
            for (int userGuess : userGuessList) {
                System.out.print(userGuess + " ");
            }
        }
        System.exit(1);
    }
}

