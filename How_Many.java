
public class How_Many {
    private int number; // UML: number: Integer 

    public How_Many(int number) {
        // Defensive Programming: Validation [cite: 25]
        if (number <= 0) {
            throw new IllegalArgumentException("Number of rooms must be positive");
        }
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
