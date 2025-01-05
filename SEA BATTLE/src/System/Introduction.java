package System;
import Color.ConsoleColors;

public class Introduction {
    public static void display(){
        String[] intro ={
                ConsoleColors.BLUE_BACKGROUND_BRIGHT + ConsoleColors.CYAN_BOLD_BRIGHT + "                                                                                                                     " + ConsoleColors.RESET,
                ConsoleColors.BLUE_BACKGROUND_BRIGHT + ConsoleColors.CYAN_BOLD_BRIGHT + "   ▄████████    ▄████████    ▄████████      ▀█████████▄     ▄████████     ███         ███      ▄█          ▄████████ " + ConsoleColors.RESET,
                ConsoleColors.BLUE_BACKGROUND_BRIGHT + ConsoleColors.CYAN_BOLD_BRIGHT + "  ███    ███   ███    ███   ███    ███        ███    ███   ███    ███ ▀█████████▄ ▀█████████▄ ███         ███    ███ " + ConsoleColors.RESET,
                ConsoleColors.BLUE_BACKGROUND_BRIGHT + ConsoleColors.CYAN_BOLD_BRIGHT + "  ███    █▀    ███    █▀    ███    ███        ███    ███   ███    ███    ▀███▀▀██    ▀███▀▀██ ███         ███    █▀  " + ConsoleColors.RESET,
                ConsoleColors.BLUE_BACKGROUND_BRIGHT + ConsoleColors.CYAN_BOLD_BRIGHT + "  ███         ▄███▄▄▄       ███    ███       ▄███▄▄▄██▀    ███    ███     ███   ▀     ███   ▀ ███        ▄███▄▄▄     " + ConsoleColors.RESET,
                ConsoleColors.BLUE_BACKGROUND_BRIGHT + ConsoleColors.CYAN_BOLD_BRIGHT + "▀███████████ ▀▀███▀▀▀     ▀███████████      ▀▀███▀▀▀██▄  ▀███████████     ███         ███     ███       ▀▀███▀▀▀     " + ConsoleColors.RESET,
                ConsoleColors.BLUE_BACKGROUND_BRIGHT + ConsoleColors.CYAN_BOLD_BRIGHT + "         ███   ███    █▄    ███    ███        ███    ██▄   ███    ███     ███         ███     ███         ███    █▄  " + ConsoleColors.RESET,
                ConsoleColors.BLUE_BACKGROUND_BRIGHT + ConsoleColors.CYAN_BOLD_BRIGHT + "   ▄█    ███   ███    ███   ███    ███        ███    ███   ███    ███     ███         ███     ███▌    ▄   ███    ███ " + ConsoleColors.RESET,
                ConsoleColors.BLUE_BACKGROUND_BRIGHT + ConsoleColors.CYAN_BOLD_BRIGHT + " ▄████████▀    ██████████   ███    █▀       ▄█████████▀    ███    █▀     ▄████▀      ▄████▀   █████▄▄██   ██████████ " + ConsoleColors.RESET,
                ConsoleColors.BLUE_BACKGROUND_BRIGHT + ConsoleColors.CYAN_BOLD_BRIGHT + "                                                                                              ▀                      " + ConsoleColors.RESET,
                ConsoleColors.PURPLE_BOLD_BRIGHT + "                                                                                          Made by Nam Khanh - PROPTIT" + ConsoleColors.RESET,
        };
        for(String line : intro) {
            System.out.println(line);
            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        String[] intro2 = {
                " ",
                " ",
                "                                                    _  _",
                "                                                     \\/ ",
                "   _  _                        <|",
                "    \\/              __'__     __'__      __'__",
                "                   /    /    /    /     /    /",
                "                  /\\____\\    \\____\\     \\____\\               _  _",
                "                 / ___!___   ___!___    ___!___               \\/",
                "               // (      (  (      (   (      (",
                "             / /   \\______\\  \\______\\   \\______\\",
                "           /  /   ____!_____ ___!______ ____!_____",
                "         /   /   /         //         //         /",
                "       /    /   |         ||         ||         |",
                "     /_____/     \\         \\\\         \\\\         \\",
                "           \\      \\_________\\\\_________\\\\_________\\",
                "            \\         |          |         |",
                "             \\________!__________!_________!________, ",
                "              \\|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_/",
                "               \\       PROPTIT                    /",
                "~~~~     ~~~~~~~\\________________________________/~~~~~~      ~~~~~~~",
                "   ~~~~~~~      ~~~~~       ~~~~~~~~~~~~     ~~~~~~~~~~~      ~~~~~~~~~~",
                "       ~~~~~       ~~~~~~~~~~~        ~~~~~~~~~      ~~~~~~    ~~~~~~~  ~~",
                " ",
                " ",
        };
        for(String line : intro2) {
            System.out.println(line);
            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
