package src;

public class GuestTest {
    public static void main(String[] args) {
        
        String expectedName = "Hassan";
        String expectedEmail = "hassan@example.com";

        
        Guest guest = new Guest(expectedName, expectedEmail);

        
        if (guest.getName().equals(expectedName) && guest.getAddressDetails().equals(expectedEmail)) {
            System.out.println("✅ GuestTest Passed: Data matches!");
        } else {
            System.out.println("❌ GuestTest Failed: Data mismatch.");
        }
    }
}
