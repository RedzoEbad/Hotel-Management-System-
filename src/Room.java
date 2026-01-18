package src;


public class Room  {
    private int number;
    private RoomType type;   
    public Room(int number, RoomType type) {
        
        if (number <= 0) throw new IllegalArgumentException("Invalid room number");
        if (type == null) throw new NullPointerException("RoomType cannot be null");
        this.number = number;
        this.type = type;
    }
    
    public void createGuest(String name, String address) {
        
        System.out.println("Guest " + name + " created for room " + number);
    }
}
