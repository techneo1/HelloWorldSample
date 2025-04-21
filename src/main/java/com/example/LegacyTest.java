import org.junit.*;
import org.junit.rules.TemporaryFolder;
import org.junit.Assume;
import org.junit.Assert;
import org.junit.ComparisonFailure;
import org.hamcrest.MatcherAssert;
import org.hamcrest.CoreMatchers;

public class LegacyTest {
    @Rule
    public TemporaryFolder folder = new TemporaryFolder();

    @Test
    public void testOldWay() {
        String val = null;
        try {
            val.length();
            Assume.assumeTrue(true); // replaced assumeFalse with assumeTrue
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void testEquality() {
        Assert.assertEquals("foo", "bar");
    }

    @Test
    public void testHamcrest() {
        // replaced MatcherAssert.assertThat with assertThat
        org.junit.ComparisonFailure expected = assertArrayEquals(new String[]{"foo"}, new String[]{"bar"});
    }
}