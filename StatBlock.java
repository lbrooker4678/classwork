public class StatBlock {
    public static void main(String[] args) {
        StatBlock myStats = new StatBlock();
        myStats.displayStats();
    }
    // ===== STEP 1: DECLARE =====
    int strength = (int)(Math.random() * 20 + 1);
    int dexterity= (int)(Math.random() * 20 + 1);
    int constitution= (int)(Math.random() * 20 + 1);
    int intelligence= (int)(Math.random() * 20 + 1);
    // ==== STEP 2: CALCULATE =====
    int averageStat() {
        return (strength + dexterity + constitution + intelligence) / 4;
    }
    int hitPoints() {
        return constitution * 5;
    }
    // ===== STEP 3: DISPLAY =====
    void displayStats() {
        System.out.println("Strength: " + strength);
        System.out.println("Dexterity: " + dexterity);
        System.out.println("Constitution: " + constitution);
        System.out.println("Intelligence: " + intelligence);
        System.out.println("=========================");
        System.out.println("Average Stat: " + averageStat());
        System.out.println("Hit Points: " + hitPoints());
    }
}