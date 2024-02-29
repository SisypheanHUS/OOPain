package day3;

import java.util.Scanner;

public class DecisionAndLoopsHomework {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        guessNumber();
        guessWord();
    }
    // 1. Write a program to guess the number. The program shall generate a random number and ask the user to guess it. If the user guess is higher than the random number, the program shall display "Too high", if the user guess is lower than the random number, the program shall display "Too low", and if the user guess is equal to the random number, the program shall display "You got it in x trials" where x is the number of trials the user used to guess the number.

    public static void guessNumber() {
        int number = (int) (Math.random() * 100);
        DecisionAndLoopsHomework.guessNumber(number, sc);
        sc.close();
    }

    public static void guessNumber(int number, Scanner in) {
        int count = 1;
        System.out.println("Guess the number : ");
        int guess = in.nextInt();
        while (guess != number) {
            count++;
            if (guess > number) {
                System.out.println("Too high");
            } else {
                System.out.println("Too low");
            }
            System.out.println("Guess the number : ");
            guess = in.nextInt();
        }
        System.out.println("You got it in " + count + " trials");
    }

    // 2. Write a program to guess the word. The program shall ask the user to guess a word. The program shall display the word with the correct guessed characters and the rest of the characters as "_". The program shall ask the user to key in one character of the guess word. If the user guess is correct, the program shall display the word with the correct guessed characters and the rest of the characters as "_". If the user guess is wrong, the program shall display the word with the correct guessed characters and the rest of the characters as "_". The program shall continue to ask the user to key in one character of the guess word until the user guess the word correctly. The program shall display "You got it in x trials" where x is the number of trials the user used to guess the word.
    static void guessWord() {
        String word = sc.nextLine();
        guessWord(word, sc);
    }

    static void guessWord(String word, Scanner in) {
        boolean[] guessedPositions = new boolean[word.length()];
        int trials = 0;
        while (true) {
            System.out.println("Key in one character of your guess word: ");
            String trialWord = (sc.hasNext()) ? sc.next() : "";
            trials++;

            if (trialWord.length() < 1) {
                continue;
            }
            if (trialWord.length() == 1) {
                checkTrialWord(trialWord.charAt(0), word, guessedPositions);
                trialWord = getTrialWordWithMatches(word, guessedPositions);
                System.out.println("Your trial word is: " + trialWord);
            }
            if (trialWord.equals(word)) {
                System.out.println("You got it in " + trials + " trials");
                break;
            }

        }
    }

    private static String getTrialWordWithMatches(String secretWord, boolean[] secretWordMatches) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < secretWord.length(); i++) {
            str.append((secretWordMatches[i] ? secretWord.charAt(i) : '_'));
        }
        return str.toString();
    }

    private static void checkTrialWord(char ch, String secretWord, boolean[] secretWordMatches) {
        for (int i = 0; i < secretWord.length(); i++) {
            if (secretWordMatches[i]) {
                continue;
            }
            secretWordMatches[i] = secretWord.charAt(i) == ch;
        }
    }
}
