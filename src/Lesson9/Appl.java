package Lesson9;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Appl {
    public static void main(String[] args) {
        String[] arr = new String[]{"qeq", "sqeqer", "rerer", "ffqff"};
        String[] polynd = new String[arr.length];
        LinkedList<String> list = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            StringBuilder builder = new StringBuilder(arr[i]);
            if (builder.reverse().toString().equals(arr[i])) {
                polynd[i] = builder.toString();
                list.add(builder.toString());
            }
        }
        System.out.println(list);
        System.out.println(Arrays.toString(polynd));
    }
}
