import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class SlotMachine {
    public static void main(String[] args) {
        // Step 1: Declare
        int reel1;
        int reel2;
        int reel3;
        Path coinFile = Path.of("coins.txt");
        int coin = loadCoins(coinFile);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Coins available: " + coin);
        System.out.print("How many coins would you like to bet? ");
        int bet = scanner.nextInt();

        if (bet <= 0 || bet > coin) {
            System.out.println("no?");
            return;
        }

        coin -= bet;

        // Step 2: Generate
        reel1 = (int) (Math.random() * 6 + 1);
        reel2 = (int) (Math.random() * 6 + 1);
        reel3 = (int) (Math.random() * 6 + 1);

        // if statements
        String symbol1;
if (reel1 == 0) symbol1 = "Cherry"; 
else if (reel1 == 1) symbol1 = "Lemon";
else if (reel1 == 2) symbol1 = "Orange";
else if (reel1 == 3) symbol1 = "Plum";
else if (reel1 == 4) symbol1 = "Star";
else symbol1 = "Diamond";

        String symbol2;
if (reel2 == 0) symbol2 = "Cherry"; 
else if (reel2 == 1) symbol2 = "Lemon";
else if (reel2 == 2) symbol2 = "Orange";
else if (reel2 == 3) symbol2 = "Plum";
else if (reel2 == 4) symbol2 = "Star";
else symbol2 = "Diamond";

        String symbol3;
if (reel3 == 0) symbol3 = "Cherry"; 
else if (reel3 == 1) symbol3 = "Lemon";
else if (reel3 == 2) symbol3 = "Orange";
else if (reel3 == 3) symbol3 = "Plum";
else if (reel3 == 4) symbol3 = "Star";
else symbol3 = "Diamond";

        String chance; 
        chance = (Math.random() < 0.5) ? "yes" : "no";

        // Step 3: Display (numbers only for now)
        System.out.println("=== SLOT MACHINE ===");
        pause(700);
        System.out.print("[ " + symbol1 + "|");
        pause(700);
        System.out.print(symbol2 + "|");
        pause(700);
        System.out.println(symbol3 + "]");
        pause(700);
        if (symbol1 == symbol2 && symbol2 == symbol3) {
            coin += bet * 100;
            System.out.println("JACKPOT! All three match!");
        } else if (symbol1 == symbol2 || symbol1 == symbol3 || symbol2 == symbol3) {
            coin += bet * 10;
            System.out.println("small win!");
        } else {
            System.out.println("No match — try again!");
        }
        saveCoins(coinFile, coin);
        pause(800);
        System.out.println("Coins left: " + coin);
        pause(2000);
        System.out.println("double or nothing?");
        System.out.println("current bet: " + bet);
        System.out.print("Enter 'y' to double your bet or 'n' to keep your bet: ");
        scanner.nextLine();
        String choice = scanner.nextLine().toLowerCase();
        if (choice.equals("y")) {
            chance = (Math.random() < 0.5) ? "yes" : "no";
            pause(500);
            if (chance.equals("yes")) {
                System.out.println("YOOOOOOO!!!!");
                System.out.println("Bet doubled to: " + bet);
                bet *= 2;
            } else {
                System.out.println("aw dang it!");
                bet = 0;
                System.out.println("coins: " + coin);
                saveCoins(coinFile, coin + bet);
            } 
        }
    }

    private static void pause(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException exception) {
            Thread.currentThread().interrupt();
        }
    }

    private static int loadCoins(Path coinFile) {
        try {
            return Integer.parseInt(Files.readString(coinFile).trim());
        } catch (IOException | NumberFormatException exception) {
            return 100;
        }
    }

    private static void saveCoins(Path coinFile, int coin) {
        try {
            Files.writeString(coinFile, Integer.toString(coin));
        } catch (IOException exception) {
            System.out.println("Could not save coins: " + exception.getMessage());
        }
    }
}
