package com.fazlyeva.java;

public class ExercizeTwo {

    public int[] notAlone(int[] nums, int val) {
        if (nums.length <= 2) {
            return nums;
        }
        int prev;
        int next;
        for (int i = 1; i < nums.length - 1; i++) {
            prev = nums[i - 1];
            next = nums[i + 1];
            if (nums[i] == val) {
                if (next != val && prev != val && next > prev) {
                    nums[i] = next;
                } else
                    nums[i] = prev;
            }
        }
        return nums;
    }

}
