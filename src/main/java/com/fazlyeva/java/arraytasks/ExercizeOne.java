package com.fazlyeva.java.arraytasks;

public class ExercizeOne {

    public int[] evenOdd(int[] nums) {
        int temp;
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }

        return nums;
    }
}
