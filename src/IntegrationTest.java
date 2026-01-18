package src;
import java.util.Date;

public class IntegrationTest {
    public static void main(String[] args) {
        try {
            
            Hotel hotel = new Hotel("Beach Resort");
            
            
            RoomType suiteType = new RoomType("Suite", 50000.0);
            
            
            Room room = new Room(505, suiteType);
            hotel.addRoom(room);

            
            ReserverPayer payer = ReserverPayer.create("P-100", "5555-4444-3333-2222");
            Date startDate = new Date(); 
            Date endDate = new Date(startDate.getTime() + (5 * 24 * 60 * 60 * 1000)); 

            
            
            
            Reservation res = Reservation.create(startDate, endDate, suiteType, 1);
            res.addRoom(room); 
            
            
            hotel.createReservation(res);
            payer.makeReservation(res);

            
            
            
            boolean isHotelReady = hotel.available();
            boolean isReservationLinked = (payer.getReservation() == res);

            if (isHotelReady && isReservationLinked) {
                System.out.println("✅ Integration Test Passed: Full booking flow is working!");
                System.out.println("Hotel Name: " + hotel.getName());
                System.out.println("Room Number: 505 (" + suiteType.getKind() + ")");
                System.out.println("Payer ID: " + payer.getId());
            } else {
                System.out.println("❌ Integration Test Failed!");
            }

        } catch (Exception e) {
            System.out.println("❌ Test crashed with error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
