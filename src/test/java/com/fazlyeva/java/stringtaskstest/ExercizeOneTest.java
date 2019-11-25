package com.fazlyeva.java.stringtaskstest;

import com.fazlyeva.java.stringtasks.ExercizeOne;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExercizeOneTest {

    ExercizeOne exercizeOne = new ExercizeOne();

    @Test
    public void ShouldReturnStringFirstCharReplacedTest1() {
        ///GIVEN
        String str = "";

        ///WHEN
        String actual = exercizeOne.oneTwo(str);
        String expected = "";

        ///THEN
        assertEquals(expected, actual);
    }

    @Test
    public void ShouldReturnStringFirstCharReplacedTest2() {
        ///GIVEN
        String str = "chocolate";

        ///WHEN
        String actual = exercizeOne.oneTwo(str);
        String expected = "hocolctea";

        ///THEN
        assertEquals(expected, actual);
    }

    @Test
    public void ShouldReturnStringFirstCharReplacedTest3() {
        ///GIVEN
        String str = "xy";

        ///WHEN
        String actual = exercizeOne.oneTwo(str);
        String expected = "";

        ///THEN
        assertEquals(expected, actual);
    }

    @Test
    public void ShouldReturnStringFirstCharReplacedTest4() {
        ///GIVEN
        String str = "xabxabxabxabxabxabxab";

        ///WHEN
        String actual = exercizeOne.oneTwo(str);
        String expected = "abxabxabxabxabxabxabx";

        ///THEN
        assertEquals(expected, actual);
    }
}