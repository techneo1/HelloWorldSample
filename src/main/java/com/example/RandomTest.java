import org.apache.commons.lang3.RandomStringUtils;

public class RandomTest {
    public String genRandom() {
        String randomAlphanumericString = RandomStringUtils.randomAlphanumeric(10);
        return randomAlphanumericString;
    }
}

// Summary of changes: Replaced RandomStringGenerator with RandomStringUtils from Apache Commons Lang 3.17.0