package Object;
import Color.ConsoleColors;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import Color.ConsoleColors;

public class Player {
    private final String name;
    private final Board ownBoard;
    private final Board fogBoard;
    private final List<Ship> ships;

    public Player(String name) {
        this.name = name;
        this.ownBoard = new Board();
        this.fogBoard = new Board();
        this.ships = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public Board getOwnBoard() {
        return ownBoard;
    }

    public Board getFogBoard() {
        return fogBoard;
    }

    public boolean placeShip(Ship ship, String start, String end) {
        int startRow = start.charAt(0) - 'A';
        int startCol = Integer.parseInt(start.substring(1)) - 1;
        int endRow = end.charAt(0) - 'A';
        int endCol = Integer.parseInt(end.substring(1)) - 1;
        boolean placed = ownBoard.placeShip(ship, startRow, startCol, endRow, endCol);
        if (placed) ships.add(ship);
        return placed;
    }
}
