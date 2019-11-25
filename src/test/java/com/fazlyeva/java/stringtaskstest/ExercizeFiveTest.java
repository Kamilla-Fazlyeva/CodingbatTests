package com.fazlyeva.java.stringtaskstest;

import com.fazlyeva.java.stringtasks.ExercizeFive;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExercizeFiveTest {

    ExercizeFive exercizeFive = new ExercizeFive();

    @Test
    public void ShouldReturnTrueIfStringIsXYBalancedTest1() {
        ///GIVEN
        String str = "";

        ///WHEN
        boolean actual = exercizeFive.xyBalance(str);
        boolean expected = true;

        ///THEN
        assertEquals(expected, actual);
    }

    @Test
    public void ShouldReturnTrueIfStringIsXYBalancedTest2() {
        ///GIVEN
        String str = "aaxbby";

        ///WHEN
        boolean actual = exercizeFive.xyBalance(str);
        boolean expected = true;

        ///THEN
        assertEquals(expected, actual);
    }

    @Test
    public void ShouldReturnTrueIfStringIsXYBalancedTest3() {
        ///GIVEN
        String str = "yxyxyxyx";

        ///WHEN
        boolean actual = exercizeFive.xyBalance(str);
        boolean expected = false;

        ///THEN
        assertEquals(expected, actual);
    }

    @Test
    public void ShouldReturnTrueIfStringIsXYBalancedTest4() {
        ///GIVEN
        String str = "bbb";

        ///WHEN
        boolean actual = exercizeFive.xyBalance(str);
        boolean expected = true;

        ///THEN
        assertEquals(expected, actual);
    }

    @Test
    public void ShouldReturnTrueIfStringIsXYBalancedTest5() {
        ///GIVEN
        String str = "y";

        ///WHEN
        boolean actual = exercizeFive.xyBalance(str);
        boolean expected = true;

        ///THEN
        assertEquals(expected, actual);
    }
}