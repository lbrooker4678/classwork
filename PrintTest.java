public class PrintTest {
    public static void main(String[] args) {
    int a = 10;
int b = 3;
System.out.println(a + b);              // 13 (math, no string)
System.out.println("" + a + b);         // 103 (all concatenation)
System.out.println("" + (a + b));       // 13 (math first, then concatenate)
System.out.println(a + " + " + b + " = " + (a + b));  // 10 + 3 = 13
// Empty println gives a blank line
System.out.println();

// Separator lines
System.out.println("====================");

// Aligned columns (tabs)
System.out.println("Name\tLevel\tHP");
System.out.println("Aria\t5\t85");

System.out.println("She said \"Roll for initiative!\"");

//square 
        System.out.println("width:\t height:\n50\t50");
        System.out.println("he \\ sighed \"are you fr\"");
        System.out.println("score: " + 5 + 10);
    } 
    
}
