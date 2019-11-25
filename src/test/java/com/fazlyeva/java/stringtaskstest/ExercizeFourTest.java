package com.fazlyeva.java.stringtaskstest;

import com.fazlyeva.java.stringtasks.ExercizeFour;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExercizeFourTest {

    ExercizeFour exercizeFour = new ExercizeFour();

    @Test
    public void ShouldReturnStringRepeatFrontTest1() {
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
    public void ShouldReturnStringRepeatFrontTest2() {
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
    public void ShouldReturnStringRepeatFrontTest3() {
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
    public void ShouldReturnStringRepeatFrontTest4() {
        ///GIVEN
        String str = "Ice Cream";
        int n = 0;

        ///WHEN
        String actual = exercizeFour.repeatFront(str, n);
        String expected = "";

        ///THEN
        assertEquals(expected, actual);
    }
}