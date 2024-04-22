import java.util.Scanner;


// Główna klasa programu
public class Main {
    public static void main(String[] args) {
        UserInterface ui = new UserInterface();
        ui.start();
        ui.closeScanner();
    }
}