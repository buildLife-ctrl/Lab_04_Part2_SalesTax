import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //variables
        double purchasePrice;
        double TAX_RATE = 0.05;
        double total;

        //output and input
        System.out.println("What is price of your purchase?");
        purchasePrice = scan.nextDouble();

        //process of figuring out total price
        total = (purchasePrice * TAX_RATE) + purchasePrice;

        //output the total
        System.out.println("Your total with the sales tax rate of " +
                "5% is $" + total + ".");
    }
}