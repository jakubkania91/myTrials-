package pl.devsmentoring;

import java.util.Scanner;

public class MyTrialNewQuestion {
    public static void main(String[] args) {
        System.out.println("Podaj zdanie, sprawdzmy czy podane zdanie jest palindromem");

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) { // dlaczego tu np. jest hasNext, skąd to wiedzieć?
            String sentence = scanner.nextLine();
            if (sentence.equals("koniec")) {
                break;
            }

            boolean isPalindrome = true;
            for (int i = 0; i < sentence.length() / 2; i++) {
                char currentChar = sentence.charAt(i);
                char otherChar = sentence.charAt(sentence.length() - i - 1);

                if (currentChar != otherChar) {
                    isPalindrome = false;
                    break;
                }
            }
            if (isPalindrome) {
                System.out.println("Podane zdanie: [" + sentence + "] jest palindromem.");
            } else {
                System.out.println("Podane zdanie: [" + sentence + "] nie jest palindromem");
            }
            System.out.println("Podaj kolejne zdanie");
        }

        System.out.println("Koniec działania programu");
    }
}
