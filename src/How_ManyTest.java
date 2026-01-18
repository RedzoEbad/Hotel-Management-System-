package src;
import static org.junit.Assert.*;
import org.junit.Test;

public class How_ManyTest {

    @Test
    public void testHowManyCreation_ShouldSetValidNumber() {
        
        int expectedNumber = 5;

        
        How_Many hm = new How_Many(expectedNumber);

        
        assertEquals(expectedNumber, hm.getNumber());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testHowMany_WithZero_ShouldThrowException() {
        
        int invalidNumber = 0;

        
        new How_Many(invalidNumber);
        
        
    }

    @Test(expected = IllegalArgumentException.class)
    public void testHowMany_WithNegativeNumber_ShouldThrowException() {
        
        int negativeNumber = -1;

        
        new How_Many(negativeNumber);
    }
}
