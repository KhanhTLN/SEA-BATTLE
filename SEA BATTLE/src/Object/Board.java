package Object;

public class Board {
    private final Cell[][] grid;

    public Board() {
        grid = new Cell[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                grid[i][j] = new Cell();
            }
        }
    }

    public boolean placeShip(Ship ship, int startRow, int startCol, int endRow, int endCol) {
        if (!isValidPlacement(ship, startRow, startCol, endRow, endCol)) return false;

        if (startRow == endRow) {
            for (int j = startCol; j <= endCol; j++) {
                grid[startRow][j].placeShip();
            }
        } else {
            for (int i = startRow; i <= endRow; i++) {
                grid[i][startCol].placeShip();
            }
        }
        return true;
    }

    private boolean isValidPlacement(Ship ship, int startRow, int startCol, int endRow, int endCol) {
        if (startRow != endRow && startCol != endCol) return false;
        int length = (startRow == endRow) ? (endCol - startCol + 1) : (endRow - startRow + 1);
        if (length != ship.getSize()) return false;

        // Check for overlap
        if (startRow == endRow) {
            for (int j = startCol; j <= endCol; j++) {
                if (grid[startRow][j].hasShip()) return false;
            }
        } else {
            for (int i = startRow; i <= endRow; i++) {
                if (grid[i][startCol].hasShip()) return false;
            }
        }
        return true;
    }

    public boolean attackCell(int row, int col) {
        if (grid[row][col].isHit()) return false;
        grid[row][col].markHit();
        return grid[row][col].hasShip();
    }

    public void printBoard(boolean revealShips) {
        System.out.print("    ");
        for (int i = 1; i <= 10; i++) {
            System.out.print(" " + i + "  ");
        }
        System.out.println();
        System.out.println("  ╔" + "═══╦".repeat(9) + "═══╗");
        for (int i = 0; i < 10; i++) {
            System.out.print((char) ('A' + i) + " ║");
            for (int j = 0; j < 10; j++) {
                System.out.print(grid[i][j].display(revealShips) + "║");
            }
            System.out.println();
            if (i < 9) {
                System.out.println("  ╠" + "═══╬".repeat(9) + "═══╣");
            }
        }
        System.out.println("  ╚" + "═══╩".repeat(9) + "═══╝");
    }
}
