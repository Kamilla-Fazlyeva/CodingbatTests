package com.fazlyeva.java.arraytasks;

import com.fazlyeva.java.arraytasks.*;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        ExercizeOne exercizeOne = new ExercizeOne();
        int[] nums = {3, 3, 2};
        int[] result = exercizeOne.evenOdd(nums);
        System.out.println(Arrays.toString(exercizeOne.evenOdd(nums)));

        ExercizeTwo exercizeTwo = new ExercizeTwo();
        int[] numsTwo = {1, 2, 3};
        int val = 2;
        System.out.println(Arrays.toString(exercizeOne.evenOdd(numsTwo)));

        ExercizeThree exercizeThree = new ExercizeThree();
        int[] numsThree = {1, 1, 1};
        int len = 1;
        boolean resultThree = exercizeThree.sameEnds(numsThree, len);
        System.out.println(resultThree);

        ExercizeFour exercizeFour = new ExercizeFour();
        int[] numsFour= {4, 2, 2, 3};
        boolean resultFour = exercizeFour.twoTwo(numsFour);
        System.out.println(resultFour);

        ExercizeFive exercizeFive = new ExercizeFive();
        int[] nums1 = {};
        int[] nums2 = {};
        int resultFive = exercizeFive.matchUp(nums1, nums2);
        System.out.println(resultFive);
    }
}
