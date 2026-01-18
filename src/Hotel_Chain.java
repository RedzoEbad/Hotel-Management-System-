package src;


import java.util.ArrayList;
import java.util.List;

public class Hotel_Chain {
    
    private String name;
    
    
    private List<Hotel> hotels;
    private List<ReserverPayer> payers;

    
    public Hotel_Chain(String name) {
        this.name = name;
        this.hotels = new ArrayList<>();
        this.payers = new ArrayList<>();
    }

    
    public void createReserverPayer(String id, String card) {
        
        ReserverPayer newPayer = ReserverPayer.create(id, card);
        this.payers.add(newPayer);
    }
    public void addPayer(ReserverPayer payer) {
        this.payers.add(payer);
    }

    
    public void makeReservation(ReserverPayer payer, Reservation res) {
        if (payers.contains(payer)) {
            payer.makeReservation(res);
        }
    }

    
    public void addHotel(Hotel hotel) {
        this.hotels.add(hotel);
    }

    
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
