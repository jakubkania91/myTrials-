package pl.devsmentoring;

import java.util.Arrays;

public class secondArrayAnimalsList {
    public static void main(String[] args) {

        String[] mammals = {"lion", "elephant", "hourse"};
        String[] reptiles = {"frog", "snake", "lizard", "spider"};

        System.out.println("Types Mammals");
        System.out.println(mammals);
        System.out.println();
        System.out.println("Types Reptiles");
        System.out.println(reptiles);

       String[] newmammals = Arrays.copyOf(mammals, 3);
        System.out.println(newmammals[0]);
        System.out.println(newmammals[1]);

        System.out.println(Arrays.equals(mammals, reptiles));
        System.out.println(Arrays.equals(newmammals, mammals));

        String[] allAnimals = Arrays.copyOf(mammals, mammals.length + reptiles.length);
        System.out.println(Arrays.toString(allAnimals));
        System.arraycopy(reptiles, 0, allAnimals, mammals.length, reptiles.length);
        System.out.println(Arrays.toString(allAnimals));

    }
}
