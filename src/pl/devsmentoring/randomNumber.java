package pl.devsmentoring;

public class randomNumber {
    public static void main(String[] args) {
        int max = 1;
        int min = -3;
        System.out.println("random number from -3 to 1");
        Double randomFrom = min + Math.random() * ((max - min) + 1);
        System.out.println(randomFrom.intValue());
    }
}
