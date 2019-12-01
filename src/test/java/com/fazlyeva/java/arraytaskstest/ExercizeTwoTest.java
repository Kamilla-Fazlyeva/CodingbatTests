package com.fazlyeva.java.arraytaskstest;

import com.fazlyeva.java.arraytasks.ExercizeTwo;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExercizeTwoTest {

    ExercizeTwo exercizeTwo = new ExercizeTwo();

    @Test
    public void shouldReturnArrayWhereAloneValueReplacedByLargerOne() {
        ///GIVEN
        int[] nums = {1, 2, 3, 2, 5, 2};
        int val = 2;

        ///WHEN
        int[] actual = exercizeTwo.notAlone(nums, val);
        int[] expected = {1, 3, 3, 5, 5, 2};

        ///THEN
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturnEmptyArrayWhenNoNumbersAtAll() {
        ///GIVEN
        int[] nums = {};
        int val = 3;

        ///WHEN
        int[] actual = exercizeTwo.notAlone(nums, val);
        int[] expected = {};

        ///THEN
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturnOriginalArrayWhenOnlyOneNumber() {
        ///GIVEN
        int[] nums = {2};
        int val = 2;

        ///WHEN
        int[] actual = exercizeTwo.notAlone(nums, val);
        int[] expected = {2};

        ///THEN
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturnOriginalArrayWhenNoOneIsAloneTestOne() {
        ///GIVEN
        int[] nums = {1, 1, 1, 2};
        int val = 1;

        ///WHEN
        int[] actual = exercizeTwo.notAlone(nums, val);
        int[] expected = {1, 1, 1, 2};

        ///THEN
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturnOriginalArrayWhenNoOneIsAloneTestTwo() {
        ///GIVEN
        int[] nums = {1, 1, 1};
        int val = 1;

        ///WHEN
        int[] actual = exercizeTwo.notAlone(nums, val);
        int[] expected = {1, 1, 1};

        ///THEN
        assertArrayEquals(expected, actual);
    }

    @Test(expected = NullPointerException.class)
    public void shouldReturnExpectedExceptionWhenArrayIsNull() {
        ///GIVEN
        int[] nums = null;
        int val = 1;

        ///WHEN
        int[] actual = exercizeTwo.notAlone(nums, val);

        ///THEN
        assertEquals(NullPointerException.class, actual);
    }
}