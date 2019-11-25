package com.fazlyeva.java.stringtasks;

public class Main {

    public static void main(String[] args) {

        ExercizeOne exercizeOne = new ExercizeOne();
        String result = exercizeOne.oneTwo("");
        System.out.println(result);

        ExercizeTwo exercizeTwo = new ExercizeTwo();
        boolean resultTwo = exercizeTwo.prefixAgain("abc", 1);
        System.out.println(resultTwo);

        ExercizeThree exercizeThree = new ExercizeThree();
        String resultThree = exercizeThree.repeatSeparator("Word", "String", 2);
        System.out.println(resultThree);

        ExercizeFour exercizeFour = new ExercizeFour();
        String resultFour = exercizeFour.repeatFront("abc", 2);
        System.out.println(resultFour);

        ExercizeFive exercizeFive = new ExercizeFive();
        boolean resultFive = exercizeFive.xyBalance("");
        System.out.println(result);
    }
}
