package pl.devsmentoring;

import java.util.Scanner;

public class MyFirstLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe calkowita");
        int value = scanner.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(i);

        }

    }
}
