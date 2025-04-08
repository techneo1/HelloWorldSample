import org.junit.*;
import org.junit.rules.TemporaryFolder;
import static org.junit.Assert.*;

public class LegacyTest {
    @Rule
    public TemporaryFolder folder = new TemporaryFolder();

    @Test(expected = IllegalArgumentException.class)
    public void testOldWay() {
        String val = null;
        val.length(); // Should throw
    }

    @Test
    public void testEquality() {
        assertEquals("foo", "bar");
    }

    @Test
    public void testHamcrest() {
        assertThat("foo", org.hamcrest.CoreMatchers.is("bar"));
    }
}
