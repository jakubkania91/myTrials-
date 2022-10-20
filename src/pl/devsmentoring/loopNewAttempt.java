package pl.devsmentoring;

public class loopNewAttempt {
    public static void main(String[] args) {

        System.out.println();

        String[] meals = {"Soup", "Pasta", "Fish", "Hamburger"};

        for (int index = 0; index < meals.length; index++) {
            System.out.println("You order: " + meals[index] + ", enjoy your meal ");
        }
        System.out.println();
        System.out.println();

        String[] meal = {"Soup", "Pasta", "Fish", "Hamburger"};
        int index = 0;
        while (index < meal.length) {
            System.out.println("You order: " + meal[index] + ", enjoy your meal");
            index++;
        }

        System.out.println();
        System.out.println();

        int index1 = 0;
        do {
            System.out.println("You order: " + meal[index1] + ", enjoy your meal" );
            index1++;

        } while (index1 < meal.length);
    }
}



