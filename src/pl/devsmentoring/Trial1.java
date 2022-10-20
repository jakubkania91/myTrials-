package pl.devsmentoring;

import java.util.Scanner;

public class Trial1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        String name = scanner.nextLine();
//        System.out.println(name);

        scanner.nextLine();
        scanner.close();
        if(scanner.hasNext()) {
            System.out.println("Inside hasNext condition.");
        };

    }
}
