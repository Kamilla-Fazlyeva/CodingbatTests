package com.fazlyeva.java.stringtaskstest;

import com.fazlyeva.java.stringtasks.ExercizeTwo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExercizeTwoTest {

    ExercizeTwo exercizeTwo = new ExercizeTwo();

    @Test
    public void ShouldReturnTrueIfPrefixAppearAgainTest1() {
        ///GIVEN
        String str = "abXYabc";
        int n = 3;

        ///WHEN
        boolean actual = exercizeTwo.prefixAgain(str, n);
        boolean expected = false;

        ///THEN
        assertEquals(expected, actual);
    }

    @Test
    public void ShouldReturnTrueIfPrefixAppearAgainTest2() {
        ///GIVEN
        String str = "a";
        int n = 1;

        ///WHEN
        boolean actual = exercizeTwo.prefixAgain(str, n);
        boolean expected = false;

        ///THEN
        assertEquals(expected, actual);
    }

    @Test
    public void ShouldReturnTrueIfPrefixAppearAgainTest3() {
        ///GIVEN
        String str = "ab";
        int n = 1;

        ///WHEN
        boolean actual = exercizeTwo.prefixAgain(str, n);
        boolean expected = false;

        ///THEN
        assertEquals(expected, actual);
    }

    @Test
    public void ShouldReturnTrueIfPrefixAppearAgainTest4() {
        ///GIVEN
        String str = "xyzxyxyxy";
        int n = 2;

        ///WHEN
        boolean actual = exercizeTwo.prefixAgain(str, n);
        boolean expected = true;

        ///THEN
        assertEquals(expected, actual);
    }
}