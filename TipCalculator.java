public class TipCalculator {
    public static void main(String[] args) {
        
   
        //step 1: declare variables
   
        double billCost = 45.67;
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("service quality 1-4 (1=poor, 2=ok, 3=good, 4=excellent):");
        double tipPercent = scanner.nextDouble();
        if (tipPercent < 1 || tipPercent > 4) {
            System.out.println("Error: Tip percentage must be between 1 and 4.");
            return;
        }
        if (tipPercent == 1) {
            tipPercent = 10;
        } else if (tipPercent == 2) {
            tipPercent = 15;
        } else if (tipPercent == 3) {
            tipPercent = 20;
        } else if (tipPercent == 4) {
            tipPercent = 25;
        }

        double tip ;
        System.out.println("# of people splitting the bill?:");
        int people = scanner.nextInt();
        if (people <= 0) {
            System.out.println("Error: Number of people must be greater than zero.");
            return;
        }

    //step 2: MATH!!!
    double tipAmount = billCost * (tipPercent / 100);
    System.out.println("Debug Tip: " + tipAmount);
    double totalAmount = billCost + tipAmount; 
    double perPersonCost = totalAmount / people;

    //THERE WE GO! knew it was adding wayy to many extra steps
    //note to self: when doing math like this, if its still an integer at the end no need for a string :D
    


    
    

    //step 3: display
    System.out.println("TIP CALCULATOR");
    System.out.println("=====================");
    System.out.println("Bill:" + billCost);
    System.out.println("Tip:" + tipAmount);
    System.out.println("Total:" + totalAmount);
    System.out.println("Per person:" + perPersonCost);
}
}
