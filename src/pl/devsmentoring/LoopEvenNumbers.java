package pl.devsmentoring;

public class LoopEvenNumbers {
    public static void main(String[] args) {

        for (int i = 0; i <= 100; i++) {
            if (i > 20 && i < 30) {
                continue;
            }
            if (i % 2 == 0) {
                System.out.println(i + " even number");
            }
        }
    }
}


