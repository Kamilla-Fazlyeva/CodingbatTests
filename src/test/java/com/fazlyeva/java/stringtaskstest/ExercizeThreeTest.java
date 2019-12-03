package com.fazlyeva.java.stringtaskstest;

import com.fazlyeva.java.stringtasks.ExercizeThree;
import org.junit.Test;
import static org.junit.Assert.*;

public class ExercizeThreeTest {

    private ExercizeThree exercizeThree = new ExercizeThree();

    @Test
    public void shouldReturnEmptyStringWhenCountOccurrencesIsZero() {
        ///GIVEN
        String word = "AAA";
        String sep = "";
        int count = 0;

        ///WHEN
        String actual = exercizeThree.repeatSeparator(word, sep, count);
        String expected = "";

        ///THEN
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnStringMadeOfWordWithSeparator() {
        ///GIVEN
        String word = "abc";
        String sep = "XX";
        int count = 3;

        ///WHEN
        String actual = exercizeThree.repeatSeparator(word, sep, count);
        String expected = "abcXXabcXXabc";

        ///THEN
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnOnlyOneGivenWordWhenCountIsEqualsOne() {
        ///GIVEN
        String word = "This";
        String sep = "And";
        int count = 1;

        ///WHEN
        String actual = exercizeThree.repeatSeparator(word, sep, count);
        String expected = "This";

        ///THEN
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnOnlyGivenWordIfSeparatorIsEmptyString() {
        ///GIVEN
        String word = "AAA";
        String sep = "";
        int count = 1;

        ///WHEN
        String actual = exercizeThree.repeatSeparator(word, sep, count);
        String expected = "AAA";

        ///THEN
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnNewStringEvenIfOneOfGivenStringsIsNull() {
        ///GIVEN
        String word = "AAA";
        String sep = null;
        int count = 1;

        ///WHEN
        String actual = exercizeThree.repeatSeparator(word, sep, count);
        String expected = "AAA";

        ///THEN
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnNewStringEvenIfBothOfGivenStringsAreNull() {
        ///GIVEN
        String word = null;
        String sep = null;
        int count = 1;

        ///WHEN
        String actual = exercizeThree.repeatSeparator(word, sep, count);
        String expected = "null";

        ///THEN
        assertEquals(expected, actual);
    }
}