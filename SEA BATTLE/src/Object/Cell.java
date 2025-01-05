package Object;
import Color.ConsoleColors;
import java.lang.String;
import java.util.Objects;

public class Cell {
    private boolean hasShip;
    private boolean hit;

    public Cell() {
        this.hasShip = false;
        this.hit = false;
    }

    public boolean hasShip() {
        return hasShip;
    }

    public void placeShip() {
        this.hasShip = true;
    }

    public boolean isHit() {
        return hit;
    }

    public void markHit() {
        this.hit = true;
    }

    public String display(boolean revealShips) {
        if (hit && hasShip) return ConsoleColors.RED_BRIGHT + " X " + ConsoleColors.RESET;
        if (hit && !hasShip) return ConsoleColors.BLUE_BRIGHT + " O " + ConsoleColors.RESET;
        if (revealShips && hasShip) return ConsoleColors.GREEN_BRIGHT + " S " + ConsoleColors.RESET;
        return ConsoleColors.BLUE_BACKGROUND_BRIGHT + " ~ " + ConsoleColors.RESET;
    }
}