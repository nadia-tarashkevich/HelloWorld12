package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void testMultilineStringComparison() {
        String actual = "Hello and welcome!\ni = 1\ni = 2\ni = 3\ni = 4\ni = 5";
        String expected = "Hello and welcome!\ni = 1\ni = 22\ni = 3\ni = 4\ni = 5"; // Intentionally wrong

        assertEquals("The multiline strings are not equal", expected, actual);
    }
}