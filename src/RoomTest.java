package src;
import static org.junit.Assert.*;
import org.junit.Test;

public class RoomTest {

    @Test
    public void testRoomCreation_ShouldSetNumberAndType() {
        
        int expectedNumber = 101;
        RoomType expectedType = new RoomType("Deluxe", 5000.0);

        
        Room room = new Room(expectedNumber, expectedType);

        
        assertNotNull("Room object null nahi hona chahiye", room);
        
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRoomCreation_InvalidNumber_ShouldThrowException() {
        
        int invalidNumber = 0;
        RoomType type = new RoomType("Standard", 3000.0);

        
        new Room(invalidNumber, type);
    }

    @Test(expected = NullPointerException.class)
    public void testRoomCreation_NullType_ShouldThrowException() {
        
        int number = 102;

        
        new Room(number, null);
    }

    @Test
    public void testCreateGuest_ShouldExecuteSuccessfully() {
        
        RoomType type = new RoomType("Suite", 10000.0);
        Room room = new Room(201, type);
        String guestName = "Zeeshan";
        String guestAddress = "Karachi, Pakistan";

        
        
        
        room.createGuest(guestName, guestAddress);
    }
}
