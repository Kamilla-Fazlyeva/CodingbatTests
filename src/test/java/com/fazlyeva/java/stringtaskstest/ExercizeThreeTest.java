package com.fazlyeva.java.stringtaskstest;

import com.fazlyeva.java.stringtasks.ExercizeThree;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExercizeThreeTest {

    ExercizeThree exercizeThree = new ExercizeThree();

    @Test
    public void ShouldReturnStringWithSeparatorTest1() {
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
    public void ShouldReturnStringWithSeparatorTest2() {
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
    public void ShouldReturnStringWithSeparatorTest3() {
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
    public void ShouldReturnStringWithSeparatorTest4() {
        ///GIVEN
        String word = "AAA";
        String sep = "And";
        int count = 1;

        ///WHEN
        String actual = exercizeThree.repeatSeparator(word, sep, count);
        String expected = "AAA";

        ///THEN
        assertEquals(expected, actual);
    }
}