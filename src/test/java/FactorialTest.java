import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {

    @Test
    public void factorialFiveTest() {
        // Given
        Integer expected = 120;

        // When
        Integer actual = Factorial.factorial(5);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void factorialZeroTest() {
        // Given
        Integer expected = 1;

        // When
        Integer actual = Factorial.factorial(0);

        // Then
        Assert.assertEquals(expected, actual);
    }
}
