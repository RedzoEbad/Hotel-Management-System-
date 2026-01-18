import static org.junit.Assert.*;
import org.junit.Test;

public class How_ManyTest {

    @Test
    public void testHowManyCreation_ShouldSetValidNumber() {
        // 1. Arrange (Setup)
        int expectedNumber = 5;

        // 2. Act (Perform action)
        How_Many hm = new How_Many(expectedNumber);

        // 3. Assert (Verify)
        assertEquals(expectedNumber, hm.getNumber());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testHowMany_WithZero_ShouldThrowException() {
        // 1. Arrange
        int invalidNumber = 0;

        // 2. Act
        new How_Many(invalidNumber);
        
        // 3. Assert (Handled by expected annotation)
    }

    @Test(expected = IllegalArgumentException.class)
    public void testHowMany_WithNegativeNumber_ShouldThrowException() {
        // 1. Arrange
        int negativeNumber = -1;

        // 2. Act
        new How_Many(negativeNumber);
    }
}