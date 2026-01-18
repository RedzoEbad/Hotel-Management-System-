

import java.util.ArrayList;
import java.util.List;


public class Hotel {
    private String name; // UML Attribute: Name
    private List<Room> rooms; // Aggregation relationship with Room
    private List<Reservation> reservations;

    // Constructor (UML: create())
    public Hotel(String name) {
        // Defensive Programming [cite: 24, 25]
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Hotel name cannot be empty");
        }
        this.name = name;
        this.rooms = new ArrayList<>();
        this.reservations = new ArrayList<>();
    }

    // UML Operation: available()
    public boolean available() {
        // if hotel has rooms available 
        return !rooms.isEmpty();
    }

    // UML Operation: createReservation()
    public void createReservation(Reservation res) {
        if (res == null) {
            throw new NullPointerException("Reservation details cannot be null");
        }
        this.reservations.add(res);
        System.out.println("Reservation added to Hotel: " + name);
    }

    // Method to add rooms (Aggregation)
    public void addRoom(Room room) {
        if (room != null) {
            this.rooms.add(room);
        }
    }

    
    public String getName() {
        return name;
    }
}
