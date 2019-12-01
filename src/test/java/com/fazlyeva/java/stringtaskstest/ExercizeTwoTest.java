package com.fazlyeva.java.stringtaskstest;

import com.fazlyeva.java.stringtasks.ExercizeTwo;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExercizeTwoTest {

    ExercizeTwo exercizeTwo = new ExercizeTwo();

    @Test
    public void shouldReturnFalseIfFirstThreeCharsDoesntAppearAnywhere() {
        ///GIVEN
        String str = "abXYabc";
        int n = 3;

        ///WHEN
        boolean actual = exercizeTwo.prefixAgain(str, n);

        ///THEN
        assertFalse(actual);
    }

    @Test
    public void shouldReturnFalseIfLengthAndGivenNumberAreTheSame() {
        ///GIVEN
        String str = "a";
        int n = 1;

        ///WHEN
        boolean actual = exercizeTwo.prefixAgain(str, n);

        ///THEN
        assertFalse(actual);
    }

    @Test
    public void shouldReturnFalseIfFirstCharIsUniqueInTheString() {
        ///GIVEN
        String str = "ab";
        int n = 1;

        ///WHEN
        boolean actual = exercizeTwo.prefixAgain(str, n);

        ///THEN
        assertFalse(actual);
    }

    @Test
    public void shouldReturnTrueIfPrefixOfStringAppearsLater() {
        ///GIVEN
        String str = "xyzxyxyxy";
        int n = 2;

        ///WHEN
        boolean actual = exercizeTwo.prefixAgain(str, n);

        ///THEN
        assertTrue(actual);
    }

    @Test(expected = NullPointerException.class)
    public void shouldReturnExpectedExceptionIfStringIsNull() {
        ///GIVEN
        String str = null;
        int n = 2;

        ///WHEN
        boolean actual = exercizeTwo.prefixAgain(str, n);

        ///THEN
        assertTrue(actual);
    }
}