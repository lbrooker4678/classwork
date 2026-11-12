public class RandomTest {
    public static void main(String[] args) {
        // Step 1: Declare
        System.out.println((int)(Math.random() * 6 + 1));
        System.out.println((int) Math.random() * 6);
        int randomNum = (int)(Math.random() * ((max - min) + 1)) + min;
    }
}