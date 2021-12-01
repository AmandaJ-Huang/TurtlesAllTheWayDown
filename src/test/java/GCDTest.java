import org.junit.Assert;
import org.junit.Test;

import java.time.Duration;
import java.time.Instant;

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

    @Test
    public void testGCDVSGCD2() {
        // Given
        Instant start = Instant.now();
        Integer gcd = GCD.gcd(4200, 3780);
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();

        // When
        Instant start2 = Instant.now();
        Integer gcd2 = GCD.gcd(132, 84);
        Instant finish2 = Instant.now();
        long timeElapsed2 = Duration.between(start2, finish2).toMillis();

        // Then
        Assert.assertTrue(timeElapsed2 < timeElapsed);
    }
}
