package com.lab;

import org.junit.jupiter.api.Test;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

public class FilePathTest {

    @Test
    void testFileUsesSystemSeparator() {
        File file = new File("temp", "test.txt");
        String expectedPath = "temp" + File.separator + "test.txt";

        assertEquals(expectedPath, file.getPath());
        assertTrue(file.getPath().contains(File.separator));
    }

    @Test
    void testPathsGetIsCrossPlatform() {
        Path path = Paths.get("temp", "test.txt");
        File file = path.toFile();

        assertEquals(path, file.toPath());
        assertEquals("temp" + File.separator + "test.txt", file.getPath());
    }
}