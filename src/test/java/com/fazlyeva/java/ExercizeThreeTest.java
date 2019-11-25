package com.fazlyeva.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExercizeThreeTest {

    ExercizeThree exercizeThree = new ExercizeThree();

    @Test
    public void ShouldReturnTrueIfStartAndEndSameTest1() {
        ///GIVEN
        int[] nums = {5, 6, 45, 99, 13, 5, 6};
        int len = 1;

        ///WHEN
        boolean actual = exercizeThree.sameEnds(nums, len);
        boolean expected = false;

        ///THEN
        assertEquals(expected, actual);
    }

    @Test
    public void ShouldReturnTrueIfStartAndEndSameTest2() {
        ///GIVEN
        int[] nums = {5, 6, 45, 99, 13, 5, 6};
        int len = 2;

        ///WHEN
        boolean actual = exercizeThree.sameEnds(nums, len);
        boolean expected = true;

        ///THEN
        assertEquals(expected, actual);
    }

    @Test
    public void ShouldReturnTrueIfStartAndEndSameTest3() {
        ///GIVEN
        int[] nums = {1, 1, 1};
        int len = 0;

        ///WHEN
        boolean actual = exercizeThree.sameEnds(nums, len);
        boolean expected = true;

        ///THEN
        assertEquals(expected, actual);
    }

    @Test
    public void ShouldReturnTrueIfStartAndEndSameTest4() {
        ///GIVEN
        int[] nums = {};
        int len = 0;

        ///WHEN
        boolean actual = exercizeThree.sameEnds(nums, len);
        boolean expected = true;

        ///THEN
        assertEquals(expected, actual);
    }
}