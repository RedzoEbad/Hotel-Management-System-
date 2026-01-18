package src;


public class ReserverPayer {
   
    private String id;
    private String creditCardDetails;
    
    
    private Reservation reservation;

    
    public ReserverPayer(String id, String creditCardDetails) {
        this.id = id;
        this.creditCardDetails = creditCardDetails;
    }

    
    public static ReserverPayer create(String id, String creditCardDetails) {
        if (id == null || creditCardDetails == null) {
            throw new IllegalArgumentException("ID and Card details are required");
        }
        return new ReserverPayer(id, creditCardDetails);
    }
    public String getId() {
        return id;
    }
    public String getCreditCardDetails() {
        return creditCardDetails;
    }

    
    
    public void makeReservation(Reservation res) {
        this.reservation = res;
        System.out.println("Payer " + id + " made a reservation.");
    }

    public Reservation getReservation() {
        return reservation;
    }
}
