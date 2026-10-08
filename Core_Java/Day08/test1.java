package Day08;


import java.util.ArrayList;

public class test1 {
    public static void main(String[] args) {

        // int[] arr = new int[3];
        // arr1[0] = 101;
        // arr1[1] = 102;
        // arr1[2] = 103;
        // System.out.println(arr[0]);

        String[] arr1 = new String[4];

        ArrayList<Object> arr = new ArrayList<>();
        arr.add("Hello");
        arr.add("Naman");
        arr.add(true);

        System.out.println(arr);
        System.out.println(arr.get(0));
        System.out.println(arr.contains("Naman"));
        System.out.println(arr.getFirst());
        System.out.println(arr.getLast());
        System.out.println(arr.getClass());

        arr1[0] = (String) arr.getFirst();
        System.out.println(arr1[0]);

        arr1[1] = (String) arr.get(1);
        System.out.println(arr1[1]);
    }
}