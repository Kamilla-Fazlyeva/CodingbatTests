package com.fazlyeva.java.stringtasks;

public class ExercizeThree {

    public String repeatSeparator(String word, String sep, int count) {
        String repeat = "";
        for (int i = 1; i <= count; i++) {
            repeat += word;
            if (i != count) {
                repeat  += sep;
            }
        }

        return repeat;
    }

}
