package tiy.week6;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Dominique on 5/2/2016.
 */
public class StringExerciseTest {

    StringExercise stringExercise;

    @Before
    public void setUp() throws Exception {
        stringExercise = new StringExercise();
    }

    @After
    public void tearDown() throws Exception {
        // clean up work (such as closing connections, ...) goes here
    }

    @Test
    public void testSimpleReverse() throws Exception {
        String sample = "sample";
        String reversed = stringExercise.reserveString(sample);
//        assertTrue(reversed.equals("elpmas"));
        assertEquals(reversed, "elpmas");
    }

    @Test
    public void testReverseWithSpaces() throws Exception {
        String sample = "sample spaces";
        String reversed = stringExercise.reserveString("sample spaces");
//        assertTrue(reversed.equals("secaps elpmas"));
        assertEquals(reversed, "secaps elpmas");
    }

    @Test
    public void testReverseNull() throws Exception {
        String sample = null;
        String reversed = stringExercise.reserveString(sample);
        assertNull(reversed);
    }

    @Test
    public void testReverseNumberString() throws Exception {
        String sample = "123456";
        String reversed = stringExercise.reserveString(sample);
        assertEquals(reversed, "654321");
    }
}