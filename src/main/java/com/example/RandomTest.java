import org.apache.commons.text.StringEscapeUtils;

public class RandomTest {
    public String genRandom() {
        // Generate a random alphanumeric string of a specified length
        RandomStringGenerator randomStringGenerator = new RandomStringGenerator.Builder()
                .withinRange('0', 'z') // include both lowercase and uppercase letters, as well as numbers
                .filteredBy(Character::isLetterOrDigit) // filter out non-alphanumeric characters
                .build();

        String randomAlphanumericString = randomStringGenerator.generate(10); // generate a 10-character string
        return randomAlphanumericString;
    }
}