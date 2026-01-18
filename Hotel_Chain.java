

import java.util.ArrayList;
import java.util.List;

public class Hotel_Chain {
    // UML Attributes
    private String name;
    
    // Composition Relationships (Chain contains Hotels and Payers)
    private List<Hotel> hotels;
    private List<ReserverPayer> payers;

    // Constructor: UML create()
    public Hotel_Chain(String name) {
        this.name = name;
        this.hotels = new ArrayList<>();
        this.payers = new ArrayList<>();
    }

    // UML Operation: createReserverPayer()
    public void createReserverPayer(String id, String card) {
        // ReserverPayer ka create method call ho raha hai
        ReserverPayer newPayer = ReserverPayer.create(id, card);
        this.payers.add(newPayer);
    }
    public void addPayer(ReserverPayer payer) {
        this.payers.add(payer);
    }

    // UML Operation: makeReservation()
    public void makeReservation(ReserverPayer payer, Reservation res) {
        if (payers.contains(payer)) {
            payer.makeReservation(res);
        }
    }

    // Additional Helper: Hotel add karne ke liye
    public void addHotel(Hotel hotel) {
        this.hotels.add(hotel);
    }

    // UML Operations (Placeholders for logic)
    public void cancelReservation() { 
        System.out.println("Reservation cancelled.");
     }
    public void checkInGuest() {
        System.out.println("Guest checked in.");
     }
    public void checkOutGuest() { 
        System.out.println("Guest checked out.");
    }
}
