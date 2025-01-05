package System;
import java.util.Scanner;
import Color.ConsoleColors;

public class Menu {
    private static Scanner sc = new Scanner(System.in);
    public static void chooseOption(){
        System.out.println("Welcome to SEA BATTLE, choose these options below:");
        System.out.println();
        System.out.println("+------------------+");
        System.out.println("| 1.Start new game |");
        System.out.println("+------------------+");
        System.out.println("| 2.Exit           |");
        System.out.println("+------------------+");
        int option = sc.nextInt();
        switch(option){
            case 1:
                System.out.println();
                // start game
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
                for(String line : end) {
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
                chooseOption();
        }
    }
}
