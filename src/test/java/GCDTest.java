import org.junit.Assert;
import org.junit.Test;

public class GCDTest {

    @Test
    public void testTwentyFourGCD() {
        // Given
        Integer expected = 24;

        // When
        Integer actual = GCD.gcd(1440, 408);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSixGCD() {
        // Given
        Integer expected = 6;

        // When
        Integer actual = GCD.gcd(12, 6);

        // Then
        Assert.assertEquals(expected, actual);
    }
}
