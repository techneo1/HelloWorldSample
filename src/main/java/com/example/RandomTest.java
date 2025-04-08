import org.apache.commons.lang3.RandomStringUtils;

public class RandomTest {
    public String genRandom() {
// TODO: Deprecated method 'RandomStringUtils.randomAlphanumeric' found in commons-lang3.
```java
import org.apache.commons.text.RandomStringGenerator;

// Generate a random alphanumeric string of a specified length
RandomStringGenerator randomStringGenerator = new RandomStringGenerator.Builder()
        .withinRange('0', 'z') // include both lowercase and uppercase letters, as well as numbers
        .filteredBy(Character::isLetterOrDigit) // filter out non-alphanumeric characters
        .build();

String randomAlphanumericString = randomStringGenerator.generate(10); // generate a 10-character string
```
Alternatively, if you want a simpler solution without the need to create a `RandomStringGenerator` instance, you can use the following code:
```java
import org.apache.commons.text.RandomStringGenerator;

String randomAlphanumericString = new RandomStringGenerator.Builder()
        .withinRange('0', 'z')
        .filteredBy(Character::isLetterOrDigit)
        .build()
        .generate(10);
```
Note that you need to have Apache Commons Text in your classpath to use `RandomStringGenerator`.
```java
RandomStringGenerator generator = RandomStringGenerator.Builder()
        .withinRange('0', 'z')
        .filteredBy(Character::isLetterOrDigit)
        .build();
return generator.generate(10);
```
    }
}
