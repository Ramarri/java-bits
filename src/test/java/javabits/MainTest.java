package javabits;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class MainTest {
    private ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    @Before
    public void setup() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void teardown() {
        System.setOut(null);
        System.setErr(null);

    }

    @Test
    public void main() throws Exception {
        Main.main(null);

        String actual = outContent.toString();

        assertEquals("Hello, world!\n", actual);
    }
}