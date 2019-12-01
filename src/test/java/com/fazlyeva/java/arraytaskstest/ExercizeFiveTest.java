package com.fazlyeva.java.arraytaskstest;

import com.fazlyeva.java.arraytasks.ExercizeFive;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExercizeFiveTest {

    ExercizeFive exercizeFive = new ExercizeFive();

    @Test
    public void shouldReturnCountThatTwoElementsDifferByTwoOrLess() {
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
    public void shouldReturnZeroIfElementsDifferMoreThanTwo() {
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
    public void shouldReturnZeroIfElementsAreEqual() {
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
    public void shouldReturnZeroIfBothArraysAreEmpty() {
        ///GIVEN
        int[] nums1 = {};
        int[] nums2 = {};

        ///WHEN
        int actual = exercizeFive.matchUp(nums1, nums2);
        int expected = 0;

        ///THEN
        assertEquals(expected, actual);
    }

    @Test(expected = NullPointerException.class)
    public void shouldReturnExpectedExceptionWhenArrayIsEmpty() {
        ///GIVEN
        int[] nums1 = null;
        int[] nums2 = {};

        ///WHEN
        int actual = exercizeFive.matchUp(nums1, nums2);

        ///THEN
        assertEquals(NullPointerException.class, actual);
    }
}