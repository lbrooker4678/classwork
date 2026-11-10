public class DiceBackup {
    int d6 = 6;
    int d8 = 8;
    int d10 = 10;
    int d20 = 20;
    int d100 = 100;
    public static int roll(int side) {
        
        return (int) (Math.random() * side + 1);
    }
}