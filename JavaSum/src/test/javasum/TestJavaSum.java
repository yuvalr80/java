package test.javasum;

import main.javasum.JavaSum;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * @author yron
 */
public class TestJavaSum {

    private JavaSum javaSum = new JavaSum();

    @Test
    public void testIntegerSum() {
        Integer[] arr = new Integer[] { 1, 2, 3 };
        assertEquals(Integer.valueOf(6), javaSum.sum(Arrays.asList(arr)));
    }

    @Test
    public void testStringSum() {
        String[] arr = new String[] {"y","u","v","a","l"};
        assertEquals("yuval", javaSum.sum(Arrays.asList(arr)));
    }

}
