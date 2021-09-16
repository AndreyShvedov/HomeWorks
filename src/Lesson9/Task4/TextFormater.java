package Lesson9.Task4;

import java.util.LinkedList;

public class TextFormater {

    public static Integer numberOfLines(String string) {
        int space = 0;
        StringBuilder builder = new StringBuilder(string);
        for (int i = 0; i < builder.length(); i++) {
            if (builder.charAt(i) == ' ') {
                space++;
            }
        }
        return space;
    }

    public static boolean thePresenceOfAPalindrome(String string) {
        boolean p;
        Integer n = 0;
        String[] words = string.split("\\s");
        LinkedList<String> list = new LinkedList<>();
        for (int i = 0; i < words.length; i++) {
            StringBuilder builder = new StringBuilder(words[i]);
            if (builder.reverse().toString().equals(words[i])) {
                n++;
            }
        }
        if (n != 0) {
            p = true;
        } else {
            p = false;
        }
        return p;
    }

    public void palindromeSearch(String string) {
        String[] words = string.split("\\s");
        LinkedList<String> list = new LinkedList<>();
        for (int i = 0; i < words.length; i++) {
            StringBuilder builder = new StringBuilder(words[i]);
            if (builder.reverse().toString().equals(words[i])) {
                list.add(builder.toString());
            }
        }
        System.out.println(list);
    }
}
