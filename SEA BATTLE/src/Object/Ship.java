package Object;

public class Ship {
    private final String type;
    private final int size;
    private boolean sunk;

    public Ship(String type, int size) {
        this.type = type;
        this.size = size;
        this.sunk = false;
    }

    public String getType() {
        return type;
    }

    public int getSize() {
        return size;
    }

    public boolean isSunk() {
        return sunk;
    }

    public void sink() {
        this.sunk = true;
    }
}
