package com.fazlyeva.java.arraytasks;

public class ExercizeFour {

    public boolean twoTwo(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                count++;
            } else
            if (count == 1) {
                return false;
            } else count = 0;
        }

        return (count != 1);
    }

}
