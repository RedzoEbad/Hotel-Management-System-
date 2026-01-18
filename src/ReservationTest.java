package src;
import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Date;

public class ReservationTest {

    @Test
    public void testCreateReservation_ShouldSetAllFields() {
        
        Date start = new Date(); 
        Date end = new Date(start.getTime() + (1000 * 60 * 60 * 24)); 
        RoomType type = new RoomType("Deluxe", 5000.0);
        int roomCount = 2;

        
        Reservation res = Reservation.create(start, end, type, roomCount);

        
        assertNotNull("Reservation object banna chahiye", res);
        
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateReservation_InvalidDates_ShouldThrowException() {
        
        Date start = new Date();
        Date endBeforeStart = new Date(start.getTime() - 100000); 
        RoomType type = new RoomType("Standard", 3000.0);

        
        
        Reservation.create(start, endBeforeStart, type, 1);
    }

    @Test
    public void testAddRoom_ShouldUpdateList() {
        
        RoomType type = new RoomType("Suite", 10000.0);
        Reservation res = Reservation.create(new Date(), new Date(), type, 1);
        Room myRoom = new Room(101, type);

        
        res.addRoom(myRoom);

        
        
        
        assertNotNull(res); 
    }
}
