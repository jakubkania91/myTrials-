package pl.devsmentoring;

public class MyNewArray {
    public static void main(String[] args) {

        int[] numbers = new int[10];

        int[] nams = {5, 10, 15, 21, 37};

        for (int nam: nams) {
            System.out.println(nam);

        }
        nams[3] = 45;
        System.out.println(nams[3]);
    }
}
