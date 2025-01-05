//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import System.mainGame;
import java.util.Scanner;
import System.Introduction;
import System.Menu;

public class Main {
    public static void main(String[] args) {
        mainGame game = new mainGame();
        Introduction.display();
        game.start();
    }
}