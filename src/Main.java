package src;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        try {
            
            Hotel_Chain myChain = new Hotel_Chain("Ramada Group");
            Hotel myHotel = new Hotel("Ramada karachi");
            myChain.addHotel(myHotel);

            
            RoomType luxury = new RoomType("Deluxe", 25000.0);
            Room r101 = new Room(101, luxury);
            myHotel.addRoom(r101);

            
            
            myChain.createReserverPayer("P-5501", "1234567812345678");

            ReserverPayer payer = ReserverPayer.create("P-5501", "1234567812345678");

            
            Date today = new Date();
            Date nextWeek = new Date(today.getTime() + (7 * 24 * 60 * 60 * 1000));

            
            Reservation myRes = Reservation.create(today, nextWeek, luxury, 1);
            
            myChain.makeReservation(payer, myRes);

            
            
            r101.createGuest("Ebad Khan", "8, Karachi");

            
            System.out.println("\n--- Reservation Summary ---");
            System.out.println("Hotel: " + myHotel.getName());
            System.out.println("Payer ID: " + payer.getId());
            System.out.println("Room Type: " + luxury.getKind());
            System.out.println("Total Cost per night: " + luxury.getCost());
            System.out.println("Status: System Running Successfully!");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
