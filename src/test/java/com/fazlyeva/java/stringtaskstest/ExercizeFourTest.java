package com.fazlyeva.java.stringtaskstest;

import com.fazlyeva.java.stringtasks.ExercizeFour;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExercizeFourTest {

    ExercizeFour exercizeFour = new ExercizeFour();

    @Test
    public void shouldReturnEmptyStringWhereThereIsNothingToRepeat() {
        ///GIVEN
        String str = "";
        int n = 0;

        ///WHEN
        String actual = exercizeFour.repeatFront(str, n);
        String expected = "";

        ///THEN
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnStringWithRepeatedFront() {
        ///GIVEN
        String str = "Chocolate";
        int n = 4;

        ///WHEN
        String actual = exercizeFour.repeatFront(str, n);
        String expected = "ChocChoChC";

        ///THEN
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnStringOfOneCharIfGivenCountIsOne() {
        ///GIVEN
        String str = "Java";
        int n = 1;

        ///WHEN
        String actual = exercizeFour.repeatFront(str, n);
        String expected = "J";

        ///THEN
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnEmptyStringIfGivenCountIsZero() {
        ///GIVEN
        String str = "Ice Cream";
        int n = 0;

        ///WHEN
        String actual = exercizeFour.repeatFront(str, n);
        String expected = "";

        ///THEN
        assertEquals(expected, actual);
    }

    @Test(expected = NullPointerException.class)
    public void shouldReturnExpectedExceptionWhenStringIsNull() {
        ///GIVEN
        String str = null;
        int n = 2;

        ///WHEN
        String actual = exercizeFour.repeatFront(str, n);

        ///THEN
        assertEquals(NullPointerException.class, actual);
    }
}