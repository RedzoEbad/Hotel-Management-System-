package src;
import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Date;

public class ReserverPayerTest {

    @Test
    public void testCreateReserverPayer_ShouldSetCorrectDetails() {
        
        String expectedId = "P-101";
        String expectedCard = "1234-5678-9012";

        
        ReserverPayer payer = ReserverPayer.create(expectedId, expectedCard);

        
        assertNotNull("Payer object null nahi hona chahiye", payer);
        assertEquals(expectedId, payer.getId());
        assertEquals(expectedCard, payer.getCreditCardDetails());
    }

    @Test
    public void testMakeReservation_ShouldLinkReservationToPayer() {
        
        ReserverPayer payer = ReserverPayer.create("P-101", "1234-5678");
        
        Reservation mockRes = new Reservation(new Date().getTime() + (1000 * 60 * 60 * 24)); 

        
        payer.makeReservation(mockRes);

        
        assertNotNull("Reservation link honi chahiye", payer.getReservation());
        assertEquals(mockRes, payer.getReservation());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreate_WithNullId_ShouldThrowException() {
        
        
        ReserverPayer.create(null, "1234-5678");

        
    }
}
