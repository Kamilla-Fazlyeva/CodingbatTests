package com.fazlyeva.java.stringtasks;

public class ExercizeFive {

    public boolean xyBalance(String str) {
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == 'x') {
                return false;
            }
            if (str.charAt(i) == 'y') {
                return true;
            }
        }

        return true;
    }

}
