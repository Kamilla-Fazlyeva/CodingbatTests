package com.fazlyeva.java.stringtaskstest;

import com.fazlyeva.java.stringtasks.ExercizeFive;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExercizeFiveTest {

    ExercizeFive exercizeFive = new ExercizeFive();

    @Test
    public void shouldReturnTrueIfStringIsEmpty() {
        ///GIVEN
        String str = "";

        ///WHEN
        boolean actual = exercizeFive.xyBalance(str);

        ///THEN
        assertTrue(actual);
    }

    @Test
    public void shouldReturnTrueIfStringIsXYBalanced() {
        ///GIVEN
        String str = "aaxbby";

        ///WHEN
        boolean actual = exercizeFive.xyBalance(str);

        ///THEN
        assertTrue(actual);
    }

    @Test
    public void shouldReturnFalseIfThereIsNoYForEveryX() {
        ///GIVEN
        String str = "yxyxyxyx";

        ///WHEN
        boolean actual = exercizeFive.xyBalance(str);

        ///THEN
        assertFalse(actual);
    }

    @Test
    public void shouldReturnTrueIfThereAreNoXYAtAll() {
        ///GIVEN
        String str = "bbb";

        ///WHEN
        boolean actual = exercizeFive.xyBalance(str);

        ///THEN
        assertTrue(actual);
    }

    @Test
    public void shouldReturnTrueIfStringContainsOnlyOneY() {
        ///GIVEN
        String str = "y";

        ///WHEN
        boolean actual = exercizeFive.xyBalance(str);

        ///THEN
        assertTrue(actual);
    }

    @Test(expected = NullPointerException.class)
    public void shouldReturnExpectedExceptionWhenStringIsNull() {
        ///GIVEN
        String str = null;

        ///WHEN
        boolean actual = exercizeFive.xyBalance(str);

        ///THEN
        assertTrue(actual);
    }
}