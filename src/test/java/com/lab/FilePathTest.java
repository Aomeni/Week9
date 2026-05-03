package com.lab;

import org.junit.jupiter.api.Test;
import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

public class FilePathTest {

    @Test
    void testWindowsPath() {
        File file = new File("C:\\temp\\test.txt");
        assertTrue(file.getPath().contains("\\"));
    }
}