package src;

public class How_Many {
    private int number; 

    public How_Many(int number) {
        
        if (number <= 0) {
            throw new IllegalArgumentException("Number of rooms must be positive");
        }
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
