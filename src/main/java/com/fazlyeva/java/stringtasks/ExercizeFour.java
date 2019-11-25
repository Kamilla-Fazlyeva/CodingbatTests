package com.fazlyeva.java.stringtasks;

public class ExercizeFour {

    public String repeatFront(String str, int n) {
        String front = str.substring(0, n);
        int i = 0;

        while (i <= n && n != 0) {
            front += str.substring(0, n-1);
            n--;
            i++;
        }

        return front;
    }

}
