package com.fazlyeva.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExercizeFiveTest {

    ExercizeFive exercizeFive = new ExercizeFive();

    @Test
    public void ShouldReturnCountTwoNumbersAreCloseTest1() {
        ///GIVEN
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 3, 5};

        ///WHEN
        int actual = exercizeFive.matchUp(nums1, nums2);
        int expected = 3;

        ///THEN
        assertEquals(expected, actual);
    }

    @Test
    public void ShouldReturnCountTwoNumbersAreCloseTest2() {
        ///GIVEN
        int[] nums1 = {5, 3};
        int[] nums2 = {0, 0};

        ///WHEN
        int actual = exercizeFive.matchUp(nums1, nums2);
        int expected = 0;

        ///THEN
        assertEquals(expected, actual);
    }

    @Test
    public void ShouldReturnCountTwoNumbersAreCloseTest3() {
        ///GIVEN
        int[] nums1 = {4, 4};
        int[] nums2 = {4, 4};

        ///WHEN
        int actual = exercizeFive.matchUp(nums1, nums2);
        int expected = 0;

        ///THEN
        assertEquals(expected, actual);
    }

    @Test
    public void ShouldReturnCountTwoNumbersAreCloseTest4() {
        ///GIVEN
        int[] nums1 = {4};
        int[] nums2 = {5};

        ///WHEN
        int actual = exercizeFive.matchUp(nums1, nums2);
        int expected = 1;

        ///THEN
        assertEquals(expected, actual);
    }
}