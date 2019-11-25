package com.fazlyeva.java;

import com.sun.javaws.IconUtil;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        ExercizeOne exercizeOne = new ExercizeOne();
        int[] nums = {3, 3, 2};
        int[] result = exercizeOne.evenOdd(nums);
        System.out.println(Arrays.toString(exercizeOne.evenOdd(nums)));

        ExercizeTwo exercizeTwo = new ExercizeTwo();
        int[] nums1 = {1, 2, 3};
        int val = 2;
        int[] result1 = exercizeTwo.notAlone(nums1, val);
        System.out.println(Arrays.toString(exercizeOne.evenOdd(nums1)));
    }
}
