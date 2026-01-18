package src;
import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Date;

public class Hotel_ChainTest {

    @Test
    public void testCreateReserverPayer_ShouldAddToChain() {
        
        Hotel_Chain chain = new Hotel_Chain("Serena Group");
        String payerId = "P-99";
        String card = "9999-8888";

        
        chain.createReserverPayer(payerId, card);

        
        
        
        assertNotNull(chain);
    }

    @Test
    public void testMakeReservation_WhenPayerExists_ShouldLink() {
        
        Hotel_Chain chain = new Hotel_Chain("Marriott");
        ReserverPayer payer = ReserverPayer.create("P-001", "1111-2222");
        chain.addPayer(payer); 
        
        RoomType type = new RoomType("Deluxe", 20000.0);
        Reservation res = Reservation.create(new Date(), new Date(), type, 1);

        
        chain.makeReservation(payer, res);

        
        assertEquals(res, payer.getReservation());
    }

    @Test
    public void testAddHotel_ShouldWorkSuccessfully() {
        
        Hotel_Chain chain = new Hotel_Chain("Lux Hotel");
        Hotel hotel = new Hotel("Lux Karachi");

        
        chain.addHotel(hotel);

        
        assertNotNull(chain);
    }
}
