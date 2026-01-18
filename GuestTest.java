
public class GuestTest {
    public static void main(String[] args) {
        // 1. Arrange
        String expectedName = "Hassan";
        String expectedEmail = "hassan@example.com";

        // 2. Act
        Guest guest = new Guest(expectedName, expectedEmail);

        // 3. Assert
        if (guest.getName().equals(expectedName) && guest.getAddressDetails().equals(expectedEmail)) {
            System.out.println("✅ GuestTest Passed: Data matches!");
        } else {
            System.out.println("❌ GuestTest Failed: Data mismatch.");
        }
    }
}