package week03.day02;

import java.util.*;

public class Unique {
    public static void main(String[] args) {
        int arr[] = {1, 11, 34, 11, 52, 61, 1, 34};
        unique(arr);
    }

    static void unique(int[] arr) {
        List<Integer> array = new ArrayList<Integer>();
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            while (i < arr.length - 1 && arr[i] == arr[i + 1])
                i++;
            array.add(arr[i]);
        }
        System.out.println(array);
    }
}
