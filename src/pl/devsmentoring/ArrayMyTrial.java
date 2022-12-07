package pl.devsmentoring;

import java.util.Arrays;

public class ArrayMyTrial {
    public static void main(String[] args) {

        String[] test;
        String[] arrayInstrumentMusic = new String[10];


        String instrument1 = "guitar";
        String instrument2 = "violin";
        String instrument3 = "flute";
        String instrument4 = "trombone";
        String instrument5 = "piano";
        String instrument6 = "keyboard";
        String instrument7 = "accordion";
        String instrument8 = "clarinet";
        String instrument9 = "trumpet";
        String instrument10 = "saxophone";

        String[] instrument = {instrument1, instrument2, instrument3, "trombone", instrument5, instrument6, instrument7, instrument8, instrument9, instrument10};
        System.out.println(Arrays.toString(instrument));

        instrument[3] = "selow";
        instrument[8] = "tambourine";
        System.out.println(Arrays.toString(instrument));



    }
}
