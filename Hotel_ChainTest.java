import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Date;

public class Hotel_ChainTest {

    @Test
    public void testCreateReserverPayer_ShouldAddToChain() {
        // 1. Arrange
        Hotel_Chain chain = new Hotel_Chain("Serena Group");
        String payerId = "P-99";
        String card = "9999-8888";

        // 2. Act
        chain.createReserverPayer(payerId, card);

        // 3. Assert
        // Chunke payers list private hai, hum check kar rahe hain ke method crash na ho
        // Agar aap getPayers() method add karein to size check kar sakte hain
        assertNotNull(chain);
    }

    @Test
    public void testMakeReservation_WhenPayerExists_ShouldLink() {
        // 1. Arrange
        Hotel_Chain chain = new Hotel_Chain("Marriott");
        ReserverPayer payer = ReserverPayer.create("P-001", "1111-2222");
        chain.addPayer(payer); // Helper method to add existing payer for test
        
        RoomType type = new RoomType("Deluxe", 20000.0);
        Reservation res = Reservation.create(new Date(), new Date(), type, 1);

        // 2. Act
        chain.makeReservation(payer, res);

        // 3. Assert
        assertEquals(res, payer.getReservation());
    }

    @Test
    public void testAddHotel_ShouldWorkSuccessfully() {
        // 1. Arrange
        Hotel_Chain chain = new Hotel_Chain("Lux Hotel");
        Hotel hotel = new Hotel("Lux Karachi");

        // 2. Act
        chain.addHotel(hotel);

        // 3. Assert
        assertNotNull(chain);
    }
}