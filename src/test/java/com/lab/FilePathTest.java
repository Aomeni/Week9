package com.lab;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FilePathTest {

    @Test
    void testHardcodedWindowsSeparator() {
        String sep = System.getProperty("file.separator");

        // ❌ Cố tình sai: assume luôn là Windows
        assertEquals("\\", sep);
    }
}