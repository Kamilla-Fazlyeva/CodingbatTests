package com.fazlyeva.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExercizeFourTest {

    ExercizeFour exercizeFour = new ExercizeFour();

    @Test
    public void ShouldReturnTrueIfTwoGoAfterTwoTest1() {
        ///GIVEN
        int[] nums = {2, 2, 4, 2};

        ///WHEN
        boolean actual = exercizeFour.twoTwo(nums);
        boolean expected = false;

        ///THEN
        assertEquals(expected, actual);
    }

    @Test
    public void ShouldReturnTrueIfTwoGoAfterTwoTest2() {
        ///GIVEN
        int[] nums = {1, 3, 4};

        ///WHEN
        boolean actual = exercizeFour.twoTwo(nums);
        boolean expected = true;

        ///THEN
        assertEquals(expected, actual);
    }

    @Test
    public void ShouldReturnTrueIfTwoGoAfterTwoTest3() {
        ///GIVEN
        int[] nums = {};

        ///WHEN
        boolean actual = exercizeFour.twoTwo(nums);
        boolean expected = true;

        ///THEN
        assertEquals(expected, actual);
    }

    @Test
    public void ShouldReturnTrueIfTwoGoAfterTwoTest4() {
        ///GIVEN
        int[] nums = {4, 2, 2, 2};

        ///WHEN
        boolean actual = exercizeFour.twoTwo(nums);
        boolean expected = true;

        ///THEN
        assertEquals(expected, actual);
    }
}