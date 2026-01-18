package src;
import static org.junit.Assert.*;
import org.junit.Test;

public class RoomTypeTest {

    @Test
    public void testRoomTypeCreation_ShouldSetCorrectValues() {
        
        String expectedKind = "Deluxe";
        double expectedCost = 25000.0;

        
        RoomType room = new RoomType(expectedKind, expectedCost);

        
        assertEquals(expectedKind, room.getKind());
        assertEquals(expectedCost, room.getCost(), 0.001); 
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRoomTypeCreation_NegativeCost_ShouldThrowException() {
        
        String kind = "Standard";
        double negativeCost = -100.0;

        
        
        new RoomType(kind, negativeCost);

        
        
    }
}
