package com.fazlyeva.java.arraytaskstest;

import com.fazlyeva.java.arraytasks.ExercizeFour;
import org.junit.Test;
import static org.junit.Assert.*;

public class ExercizeFourTest {

    private ExercizeFour exercizeFour = new ExercizeFour();

    @Test
    public void shouldReturnFalseIfThereIsNoTwoAfterTwo() {
        ///GIVEN
        int[] nums = {2, 2, 4, 2};

        ///WHEN
        boolean actual = exercizeFour.twoTwo(nums);

        ///THEN
        assertTrue(!actual);
    }

    @Test
    public void shouldReturnTrueThereIsNoTwoAtAll() {
        ///GIVEN
        int[] nums = {1, 3, 4};

        ///WHEN
        boolean actual = exercizeFour.twoTwo(nums);

        ///THEN
        assertTrue(actual);
    }

    @Test
    public void shouldReturnTrueIfArrayIsEmpty() {
        ///GIVEN
        int[] nums = {};

        ///WHEN
        boolean actual = exercizeFour.twoTwo(nums);

        ///THEN
        assertTrue(actual);
    }

    @Test
    public void shouldReturnTrueIfEveryTwoIsNextToAnotherTwo() {
        ///GIVEN
        int[] nums = {4, 2, 2, 2};

        ///WHEN
        boolean actual = exercizeFour.twoTwo(nums);

        ///THEN
        assertTrue(actual);
    }

    @Test(expected = NullPointerException.class)
    public void shouldReturnExpectedExceptionWhenArrayIsNull() {
        ///GIVEN
        int[] nums = null;

        ///WHEN
        boolean actual = exercizeFour.twoTwo(nums);
    }
}