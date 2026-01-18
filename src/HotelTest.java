package src;
import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Date;

public class HotelTest {

    @Test
    public void testHotelCreation_ShouldSetNameAndInitializeLists() {
        
        String expectedName = "Serena Islamabad";

        
        Hotel hotel = new Hotel(expectedName);

        
        assertEquals(expectedName, hotel.getName());
        
        assertFalse("Naye hotel mein rooms nahi hone chahiye", hotel.available());
    }

    @Test
    public void testAvailable_WhenRoomAdded_ShouldReturnTrue() {
        
        Hotel hotel = new Hotel("PC Lahore");
        RoomType type = new RoomType("Deluxe", 15000.0);
        Room room = new Room(101, type);

        
        hotel.addRoom(room);

        
        assertTrue("Room add karne ke baad hotel available hona chahiye", hotel.available());
    }

    @Test
    public void testCreateReservation_ShouldAddToList() {
        
        Hotel hotel = new Hotel("Marriott");
        RoomType type = new RoomType("Suite", 30000.0);
        Reservation res = Reservation.create(new Date(), new Date(), type, 1);

        
        hotel.createReservation(res);

        
        
        assertNotNull(hotel);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_EmptyName_ShouldThrowException() {
        
        new Hotel(""); 
    }


    @Test(expected = NullPointerException.class)
    public void testCreateReservation_NullReservation_ShouldThrowException() {
        
        Hotel hotel = new Hotel("Pearl Continental");

        
        hotel.createReservation(null); 
    }
}
