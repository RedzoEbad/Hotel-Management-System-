import java.util.Date;

public class IntegrationTest {
    public static void main(String[] args) {
        try {
            // --- 1. Arrange (System setup karein) ---
            Hotel hotel = new Hotel("Beach Resort");
            
            // RoomType create karein (Aapki class ke constructor ke mutabiq)
            RoomType suiteType = new RoomType("Suite", 50000.0);
            
            // Room create karein aur hotel mein add karein
            Room room = new Room(505, suiteType);
            hotel.addRoom(room);

            // Payer aur Dates setup karein
            ReserverPayer payer = ReserverPayer.create("P-100", "5555-4444-3333-2222");
            Date startDate = new Date(); // Aaj ki date
            Date endDate = new Date(startDate.getTime() + (5 * 24 * 60 * 60 * 1000)); // 5 din baad

            // --- 2. Act (Booking perform karein) ---
            
            // Reservation create karein (Static factory method use karein)
            Reservation res = Reservation.create(startDate, endDate, suiteType, 1);
            res.addRoom(room); // Actual room link karein
            
            // Hotel aur Payer ke saath link karein
            hotel.createReservation(res);
            payer.makeReservation(res);

            // --- 3. Assert (Result verify karein) ---
            
            // Hum check karenge ke hotel available hai aur payer ki reservation sahi set hui
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