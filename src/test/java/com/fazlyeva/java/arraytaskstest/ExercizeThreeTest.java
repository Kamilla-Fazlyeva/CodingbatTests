package com.fazlyeva.java.arraytaskstest;

import com.fazlyeva.java.arraytasks.ExercizeThree;
import org.junit.Test;
import static org.junit.Assert.*;

public class ExercizeThreeTest {

    private ExercizeThree exercizeThree = new ExercizeThree();

    @Test
    public void shouldReturnFalseIfStartAndEndOfArrayNotTheSame() {
        ///GIVEN
        int[] nums = {5, 6, 45, 99, 13, 5, 6};
        int len = 1;

        ///WHEN
        boolean actual = exercizeThree.sameEnds(nums, len);

        ///THEN
        assertTrue(!actual);
    }

    @Test
    public void shouldReturnTrueIfStartAndEndOfArrayTheSame() {
        ///GIVEN
        int[] nums = {5, 6, 45, 99, 13, 5, 6};
        int len = 2;

        ///WHEN
        boolean actual = exercizeThree.sameEnds(nums, len);

        ///THEN
        assertTrue(actual);
    }

    @Test
    public void shouldReturnTrueIfLengthOfNumbersIsZero() {
        ///GIVEN
        int[] nums = {1, 1, 1};
        int len = 0;

        ///WHEN
        boolean actual = exercizeThree.sameEnds(nums, len);

        ///THEN
        assertTrue(actual);
    }

    @Test
    public void shouldReturnTrueIfArrayIsEmptyAndLengthOfNumbersIsZero() {
        ///GIVEN
        int[] nums = {};
        int len = 0;

        ///WHEN
        boolean actual = exercizeThree.sameEnds(nums, len);

        ///THEN
       assertTrue(actual);
    }

    @Test
    public void shouldReturnTrueEvenIfArrayIsNull() {
        ///GIVEN
        int[] nums = null;
        int len = 0;

        ///WHEN
        boolean actual = exercizeThree.sameEnds(nums, len);
    }
}