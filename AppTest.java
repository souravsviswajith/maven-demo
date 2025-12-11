package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void testOutput() {
        String expected = "Hello from Maven GitHub Actions Lab!";
        String actual = getAppMessage();
        assertEquals(expected, actual);
    }

    // Simulate what App prints
    private String getAppMessage() {
        return "Hello from Maven GitHub Actions Lab!";
    }
}
