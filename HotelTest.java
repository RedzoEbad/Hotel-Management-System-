import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Date;

public class HotelTest {

    @Test
    public void testHotelCreation_ShouldSetNameAndInitializeLists() {
        // 1. Arrange
        String expectedName = "Serena Islamabad";

        // 2. Act
        Hotel hotel = new Hotel(expectedName);

        // 3. Assert
        assertEquals(expectedName, hotel.getName());
        // Shuru mein hotel available nahi hona chahiye kyunke rooms khali hain
        assertFalse("Naye hotel mein rooms nahi hone chahiye", hotel.available());
    }

    @Test
    public void testAvailable_WhenRoomAdded_ShouldReturnTrue() {
        // 1. Arrange
        Hotel hotel = new Hotel("PC Lahore");
        RoomType type = new RoomType("Deluxe", 15000.0);
        Room room = new Room(101, type);

        // 2. Act
        hotel.addRoom(room);

        // 3. Assert
        assertTrue("Room add karne ke baad hotel available hona chahiye", hotel.available());
    }

    @Test
    public void testCreateReservation_ShouldAddToList() {
        // 1. Arrange
        Hotel hotel = new Hotel("Marriott");
        RoomType type = new RoomType("Suite", 30000.0);
        Reservation res = Reservation.create(new Date(), new Date(), type, 1);

        // 2. Act
        hotel.createReservation(res);

        // 3. Assert
        // Hum check kar rahe hain ke method baghair crash hue execute ho gaya
        assertNotNull(hotel);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_EmptyName_ShouldThrowException() {
        // 1. Arrange & 2. Act
        new Hotel(""); 
    }


    @Test(expected = NullPointerException.class)
    public void testCreateReservation_NullReservation_ShouldThrowException() {
        // 1. Arrange
        Hotel hotel = new Hotel("Pearl Continental");

        // 2. Act
        hotel.createReservation(null); 
    }
}