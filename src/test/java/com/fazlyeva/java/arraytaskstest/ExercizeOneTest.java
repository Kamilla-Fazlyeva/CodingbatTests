package com.fazlyeva.java.arraytaskstest;

import com.fazlyeva.java.arraytasks.ExercizeOne;
import org.junit.Test;
import static org.junit.Assert.*;

public class ExercizeOneTest {

    private ExercizeOne exercizeOne = new ExercizeOne();

    @Test
    public void shouldReturnEvenNumbersBeforeOddTestOne() {
        ///GIVEN
        int[] nums = {3, 3, 2};

        ///WHEN
        int[] actual = exercizeOne.evenOdd(nums);
        int[] expected = {2, 3, 3};

        ///THEN
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturnEvenNumbersBeforeTestTwo() {
        ///GIVEN
        int[] nums = {1, 1, 0, 1, 0, 1};

        ///WHEN
        int[] actual = exercizeOne.evenOdd(nums);
        int[] expected = {0, 0, 1, 1, 1, 1};

        ///THEN
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturnEmptyArrayWhenNoNumbers() {
        ///GIVEN
        int[] nums = {};

        ///WHEN
        int[] actual = exercizeOne.evenOdd(nums);
        int[] expected = {};

        ///THEN
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturnOriginalArrayWhenContainsOneNumber() {
        ///GIVEN
        int[] nums = {3};

        ///WHEN
        int[] actual = exercizeOne.evenOdd(nums);
        int[] expected = {3};

        ///THEN
        assertArrayEquals(expected, actual);
    }

    @Test(expected = NullPointerException.class)
    public void shouldReturnExpectedExceptionWhenArrayIsNull() {
        ///GIVEN
        int[] nums = null;

        ///WHEN
        int[] actual = exercizeOne.evenOdd(nums);
    }
}