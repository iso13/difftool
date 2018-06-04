package com.diff.tool;

import java.io.File;
import java.io.IOException;

/**
 * Unit test for Diff App.
 */

public class AppTest {


    @org.junit.Test
    public void linesTest() throws IOException {
        String file1 = "files/RNB3.txt";
        String file2 = "files/RNB4.txt";

        File file3 = new File(file1);
        File file4 = new File(file2);

        System.out.println(file3.length());

        assert (file3.length() == file4.length());
    }
}