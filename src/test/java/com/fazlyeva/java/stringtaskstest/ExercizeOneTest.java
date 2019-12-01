package com.fazlyeva.java.stringtaskstest;

import com.fazlyeva.java.stringtasks.ExercizeOne;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExercizeOneTest {

    ExercizeOne exercizeOne = new ExercizeOne();

    @Test
    public void shouldReturnOriginalStringIfNoCharsAtAll() {
        ///GIVEN
        String str = "";

        ///WHEN
        String actual = exercizeOne.oneTwo(str);
        String expected = "";

        ///THEN
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnStringWhereFirstCharComeAfterNextTwo() {
        ///GIVEN
        String str = "chocolate";

        ///WHEN
        String actual = exercizeOne.oneTwo(str);
        String expected = "hocolctea";

        ///THEN
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnEmptyStringWhenLengthIsLessThanThree() {
        ///GIVEN
        String str = "xy";

        ///WHEN
        String actual = exercizeOne.oneTwo(str);
        String expected = "";

        ///THEN
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnStringWhereFirstCharComeAfterNextTwoCaseTwo() {
        ///GIVEN
        String str = "xabxabxabxabxabxabxab";

        ///WHEN
        String actual = exercizeOne.oneTwo(str);
        String expected = "abxabxabxabxabxabxabx";

        ///THEN
        assertEquals(expected, actual);
    }

    @Test(expected = NullPointerException.class)
    public void shouldReturnExpectedExceptionWhenStringIsNull() {
        ///GIVEN
        String str = null;

        ///WHEN
        String actual = exercizeOne.oneTwo(str);

        ///THEN
        assertEquals(NullPointerException.class, actual);
    }
}