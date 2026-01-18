
import java.util.Date;


public class Main {
    
    public static void main(String[] args) {
        try {
            // 1. Hotel Chain aur Hotel banana
            Hotel_Chain myChain = new Hotel_Chain("Serena Group");
            Hotel myHotel = new Hotel("Serena Islamabad");
            myChain.addHotel(myHotel);

            // 2. Room Type aur Rooms set karna
            RoomType luxury = new RoomType("Deluxe", 25000.0);
            Room r101 = new Room(101, luxury);
            myHotel.addRoom(r101);

            // 3. ReserverPayer (Jo paise dega) create karna
            // UML: HotelChain creates ReserverPayer
            myChain.createReserverPayer("P-5501", "1234567812345678");

            ReserverPayer payer = ReserverPayer.create("P-5501", "1234567812345678");

            // 4. Reservation banana (Dates set karna)
            Date today = new Date();
            Date nextWeek = new Date(today.getTime() + (7 * 24 * 60 * 60 * 1000));
            
            // UML: Reservation link with RoomType and Quantity (HowMany)
            Reservation myRes = Reservation.create(today, nextWeek, luxury, 1);
            // 5. Payer ko Reservation ke saath link karna
            myChain.makeReservation(payer, myRes);

            // 6. Guest create karna aur Room mein occupy karwana
            // UML: Room creates/manages Guest
            r101.createGuest("Ahmad Ali", "F-7, Islamabad");

            // 7. Output Check
            System.out.println("\n--- Reservation Summary ---");
            System.out.println("Hotel: " + myHotel.getName());
            System.out.println("Payer ID: " + payer.getId());
            System.out.println("Room Type: " + luxury.getKind());
            System.out.println("Total Cost per night: " + luxury.getCost());
            System.out.println("Status: System Running Successfully!");
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
