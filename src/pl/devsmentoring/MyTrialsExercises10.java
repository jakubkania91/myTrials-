package pl.devsmentoring;

import java.util.Random;
import java.util.Scanner;

public class MyTrialsExercises10 {
    public static void main(String[] args) {
        Random random = new Random();
        int numberOfAstronauts = random.nextInt(7) + 1;

        Scanner scanner = new Scanner(System.in);

        boolean wasNumberAstronauts = false;

        while (!wasNumberAstronauts) {
            System.out.println("Podaj liczbe");
            int userNumber = scanner.nextInt();

            if (userNumber < numberOfAstronauts) {
                System.out.println("Liczba jest za mala");
            } else if (userNumber > numberOfAstronauts) {
                System.out.println("Liczba jest za duza");
            } else {
                System.out.println("Brawo, to jest właściwa liczba");
                wasNumberAstronauts = true;
            }
        }
    }
}