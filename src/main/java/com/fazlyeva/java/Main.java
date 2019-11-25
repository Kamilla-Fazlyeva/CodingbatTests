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

        ExercizeThree exercizeThree = new ExercizeThree();
        int[] nums2 = {1, 1, 1};
        int len = 1;
        boolean result3 = exercizeThree.sameEnds(nums2, len);
        System.out.println(result3);
    }
}
