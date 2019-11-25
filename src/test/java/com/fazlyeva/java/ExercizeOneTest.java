package com.fazlyeva.java;

import static org.junit.jupiter.api.Assertions.*;

class ExercizeOneTest {

    ExercizeOne exercizeOne = new ExercizeOne();

    @org.junit.jupiter.api.Test
    public void ShouldReturnEvenNumbersBeforeTest1() {
        ///GIVEN
        int[] nums = {3, 3, 2};

        ///WHEN
        int[] actual = exercizeOne.evenOdd(nums);
        int[] expected = {2, 3, 3};

        ///THEN
        assertArrayEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void ShouldReturnEvenNumbersBeforeTest2() {
        ///GIVEN
        int[] nums = {1, 1, 0, 1, 0, 1};

        ///WHEN
        int[] actual = exercizeOne.evenOdd(nums);
        int[] expected = {0, 0, 1, 1, 1, 1};

        ///THEN
        assertArrayEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void ShouldReturnEvenNumbersBeforeTest3() {
        ///GIVEN
        int[] nums = {};

        ///WHEN
        int[] actual = exercizeOne.evenOdd(nums);
        int[] expected = {};

        ///THEN
        assertArrayEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void ShouldReturnEvenNumbersBeforeTest4() {
        ///GIVEN
        int[] nums = {3};

        ///WHEN
        int[] actual = exercizeOne.evenOdd(nums);
        int[] expected = {3};

        ///THEN
        assertArrayEquals(expected, actual);
    }
}