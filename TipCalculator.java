public class TipCalculator {
    public static void main(String[] args) {
   
        //step 1: declare variables
   
        double billCost = 11.00; ;
        double tipPercent = 20;
        double tip ;

    //step 2: MATH!!!
    double tipAmount = billCost * tipPercent / 100;
    tip = billCost * (tipPercent / 100);
    System.out.println("Debug Tip: " + tip);
    double totalAmount = billCost + tipAmount; 
    //THERE WE GO! knew it was adding wayy to many extra steps
    //note to self: when doing math like this, if its still an interger at the end no need for a string :D
    //another note to self: make it so you can input the bill cost and tip percent in the future, but for now this is good


    
    

    //step 3: display
    System.out.println("TIP CALCULATOR");
    System.out.println("=====================");
    System.out.println("Bill:" + billCost);
    System.out.println("Tip:" + tipAmount);
    System.out.println("Total:" + totalAmount);
}
}