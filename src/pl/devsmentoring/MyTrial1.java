package pl.devsmentoring;

import java.util.Random;
import java.util.Scanner;

public class MyTrial1 {

    public static void main(String[] args) {
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);

        boolean wasNumberGuessed = false;

        while (!wasNumberGuessed) {
            System.out.println("Podaj liczbe");
            int userNumber = scanner.nextInt();

            if (userNumber < numberToGuess) {
                System.out.println("Liczba jest za mala");
            } else if (userNumber > numberToGuess) {
                System.out.println("Liczba jest za duza");
            } else {
                System.out.println("Brawo, to jest właściwa liczba");
                wasNumberGuessed = true;
            }
        }
    }
}

