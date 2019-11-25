package com.fazlyeva.java.arraytaskstest;

import com.fazlyeva.java.arraytasks.ExercizeTwo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExercizeTwoTest {

    ExercizeTwo exercizeTwo = new ExercizeTwo();

    @Test
    public void ShouldReturnArrayAloneValueReplacedTest1() {
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
    public void ShouldReturnArrayAloneValueReplacedTest2() {
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
    public void ShouldReturnArrayAloneValueReplacedTest3() {
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
    public void ShouldReturnArrayAloneValueReplacedTest4() {
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
    public void ShouldReturnArrayAloneValueReplacedTest5() {
        ///GIVEN
        int[] nums = {1, 1, 1};
        int val = 1;

        ///WHEN
        int[] actual = exercizeTwo.notAlone(nums, val);
        int[] expected = {1, 1, 1};

        ///THEN
        assertArrayEquals(expected, actual);
    }
}