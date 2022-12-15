package pl.devsmentoring.module_5.arrayLists.meeting;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //1 Defining arraylists
        ArrayList<String> arrayList = new ArrayList<>();
//        ArrayList<Integer> intArraylist = new ArrayList<>(10);

        //2 Add some entries to arraylist
        arrayList.add("firstString");
        arrayList.add("Jacek");
        arrayList.add("Monday");
        arrayList.add("Warsaw");
        arrayList.add("Poland");
        // nie wiem tego i tego - > pogadamy na zajeciach
        arrayList.add("JPoland");
        arrayList.add("Java");

        arrayList.remove(3);
        arrayList.add(3, "ThirdIndex");
        int indexOfJacek = arrayList.indexOf("Jacek");
        int indexOfJames = arrayList.indexOf("James");
        boolean poland = arrayList.contains("Poland");
        //3 FOREACH LOOP
        /*
        for(typeOfObject variable : array){
            instructions
        }
         */


        for (String word : arrayList) {
            System.out.println(word);
        }
    }
}
