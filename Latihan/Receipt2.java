import java.util.Scanner;
       public class Receipt2 {
            public static void main(String[] args) {
                // Calculate total owed, assuming 8% tax / 15% tip
                Scanner s = new Scanner(System.in);

                System.out.print("What was the meal cost? $");
                int totalPrice = s.nextInt();
                
                double tax = totalPrice * .08;
                double tip = totalPrice * .15;
                double total = totalPrice + tax + tip;

                System.out.println("Subtotal: " + totalPrice);
                System.out.println("Tax: " + tax);
                System.out.println("Tip: " + tip);
                System.out.println("Total: " + total);
            }
}
