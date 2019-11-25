package com.fazlyeva.java.stringtasks;

public class ExercizeOne {

    public String oneTwo(String str) {
        String oneTwo = "";
        for (int i = 0; i < str.length() - 2; i += 3) {
            oneTwo += str.substring(i + 1, i + 3) + str.charAt(i);
        }
        return oneTwo;
    }

}
