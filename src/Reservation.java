package src;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Reservation {
    private Date reservationDate;
    private Date startDate;
    private Date endDate;
    private int number; 
    
    
    private RoomType roomType; 
    private List<Room> rooms;

    
    private Reservation(Date start, Date end, RoomType type, int num) {
        
        if (end.before(start)) {
            throw new IllegalArgumentException("End date cannot be before start date");
        }
        if (type == null) {
            throw new NullPointerException("RoomType is required for reservation");
        }
        
        this.reservationDate = new Date(); 
        this.startDate = start;
        this.endDate = end;
        this.number = num;
        this.roomType = type;
        this.rooms = new ArrayList<>();
    }
    public Reservation(long l) {
        
    }
    public static Reservation create(Date start, Date end, RoomType type, int num) {
        return new Reservation(start, end, type, num);
    }
    
    public void addRoom(Room room) {
        if (room != null) {
            this.rooms.add(room);
        }
    }
}
