package pl.devsmentoring;

public class LoopWelcomeGuest {
    public static void main(String[] args) {

        int guest = 0;
        while (guest <= 10) {
            guest++;

            if (guest == 3 || guest == 7) {
                System.out.println("Skip guest no: " + guest);
                continue;
            } else {
                System.out.println("Welcome guest no: " + guest);
            }

            if (guest >= 9) {
                System.out.println("Unfortunately we're not able to serve more guests...");
                break;
            }
        }
    }
}
