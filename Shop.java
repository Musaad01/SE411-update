import java.util.Scanner;

public class Shop {
    public void interact(Player player) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWelcome to the Shop! You have " + player.getGold() + " gold.");
        System.out.println("1. Health Potion (100 gold)\n2. Strength Potion (250 gold)\n3. Exit");
        System.out.print("Choose an item: ");
        String choice = scanner.nextLine();

        switch (choice) {
            case "1":
                if (player.spendGold(100)) {
                    System.out.println("You bought a Health Potion!");
                } else {
                    System.out.println("Not enough gold!");
                }
                break;
            case "2":
                if (player.spendGold(250)) {
                    System.out.println("You bought a Strength Potion!");
                } else {
                    System.out.println("Not enough gold!");
                }
                break;
            case "3":
                System.out.println("Come back anytime!");
                break;
            default:
                System.out.println("Invalid option!");
        }
    }
}
