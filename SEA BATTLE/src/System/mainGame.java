package System;

import Color.ConsoleColors;
import Object.Player;
import java.util.Scanner;
import Object.Ship;

public class mainGame {
    private Player player1;
    private Player player2;
    private final Scanner sc = new Scanner(System.in);

    public void displayMenu(){
        System.out.println("Welcome to SEA BATTLE, choose these options below:");
        System.out.println("+------------------+");
        System.out.println("| 1.Start new game |");
        System.out.println("+------------------+");
        System.out.println("| 2.Exit           |");
        System.out.println("+------------------+");
    }

    public void start() {
        displayMenu();
        int option = sc.nextInt();
        sc.nextLine();
        System.out.println();
        switch (option) {
            case 1:
                System.out.println("Enter Player 1's name: ");
                String player1Name = sc.nextLine();
                player1 = new Player(player1Name);

                System.out.println("Enter Player 2's name: ");
                String player2Name = sc.nextLine();
                player2 = new Player(player2Name);

                //System.out.println("Player1, set up your ships");
                setupShips(player1);
                setupShips(player2);
                playGame();

                break;

            case 2:
                String[] end = {
                        "  #####  ###### ######    #   #  ####  #    #    #        ##   ##### ###### ##### ",
                        " #       #      #          # #  #    # #    #    #       #  #    #   #      #    #",
                        "  #####  #####  #####       #   #    # #    #    #      #    #   #   #####  #    #",
                        "       # #      #           #   #    # #    #    #      ######   #   #      ##### ",
                        " #     # #      #           #   #    # #    #    #      #    #   #   #      #   # ",
                        "  #####  ###### ######      #    ####   ####     ###### #    #   #   ###### #    #",
                };
                for (String line : end) {
                    System.out.println(ConsoleColors.GREEN_BRIGHT + line + ConsoleColors.RESET);
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.exit(0);
                break;

            default:
                System.out.println(ConsoleColors.RED + "Invalid option. Try again." + ConsoleColors.RESET);
                start();
        }
    }

    private void setupShips(Player player) {
        Ship[] ships = {
                new Ship("Patrol Boat", 2),
                new Ship("Patrol Boat", 2),
                new Ship("Destroyer", 4),
                new Ship("Submarine", 3),
                new Ship("Battle Ship", 5)
        };

        System.out.println(player.getName() + ", place your ships:");
        for (Ship ship : ships) {
            boolean placed = false;
            while (!placed) {
                player.getOwnBoard().printBoard(true);
                System.out.println("Place " + ship.getType() + " (" + ship.getSize() + "):");
                System.out.print("Start: ");
                String start = sc.nextLine().toUpperCase();
                System.out.print("End: ");
                String end = sc.nextLine().toUpperCase();
                placed = player.placeShip(ship, start, end);
                if (!placed) System.out.println("Invalid placement. Try again.");
            }
        }
    }

    private void playGame() {
        Player currentPlayer = player1;
        Player opponent = player2;
        int currentPlayerHit = 0, opponentHit = 0;
        while (true) {
            boolean keepShooting = true;
            while (keepShooting) {
                System.out.println("\n" + ConsoleColors.GREEN_BRIGHT +  currentPlayer.getName()  + ConsoleColors.RESET +  "'s turn");
                currentPlayer.getOwnBoard().printBoard(true);
                currentPlayer.getFogBoard().printBoard(false);
                System.out.print("Enter attack coordinates: ");
                String attack = sc.nextLine().toUpperCase();
                int row = attack.charAt(0) - 'A';
                int col = Integer.parseInt(attack.substring(1)) - 1;

                if (row < 0 || row >= 10 || col < 0 || col >= 10) {
                    System.out.println("Invalid coordinates. Try again.");
                    continue;
                }

                boolean hit = opponent.getOwnBoard().attackCell(row, col);
                if (hit) {
                    System.out.println("Hit!");
                    currentPlayer.getFogBoard().attackCell(row, col);
                    currentPlayerHit++;
                    if (currentPlayerHit == 16) {
                        System.out.println(currentPlayer.getName() + " IS THE WINNER");
                        return;
                    }
                } else {
                    System.out.println("Miss!");
                    keepShooting = false;
                }
            }
            Player temp = currentPlayer;
            currentPlayer = opponent;
            opponent = temp;

            int tmp = currentPlayerHit;
            currentPlayerHit = opponentHit;
            opponentHit = tmp;
        }
    }
}