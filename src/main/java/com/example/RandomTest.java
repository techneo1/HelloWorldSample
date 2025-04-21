```java
import com.google.common.base.LocalizedStrings;
import com.google.common.base.Strings;
import com.google.common.primitives.Bytes;
import com.google.common.primitives.UnsignedBytes;

public class RandomTest {
    public String genRandom() {
        byte[] randomBytes = new byte[10];
        UnsignedBytes.fillRandomBytes(randomBytes);
        String randomAlphanumericString = Strings.newStringUtf8(Bytes.toArray(randomBytes));
        return randomAlphanumericString;
    }
}
```