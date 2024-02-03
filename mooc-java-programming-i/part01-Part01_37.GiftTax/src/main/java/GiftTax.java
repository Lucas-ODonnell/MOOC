
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int giftValue = Integer.valueOf(scan.nextLine());
        if (giftValue >= 1000000) {
            double tax = (142100 + (giftValue-1000000) * 0.17);
            System.out.println("Tax: " + tax);
        } else if (giftValue >= 200000) {
            double tax = (22100 + (giftValue-200000) * 0.15);
            System.out.println("Tax: " + tax);
        } else if (giftValue >= 55000) {
            double tax = (4700 + (giftValue-55000) * 0.12);
            System.out.println("Tax: " + tax);
        } else if (giftValue >= 25000) {
            double tax = (1700 + (giftValue-25000) * 0.10);
            System.out.println("Tax: " + tax);
        } else if (giftValue >= 5000) {
            double tax = (100 + (giftValue-5000) * 0.08);
            System.out.println("Tax: " + tax);
        } else {
            System.out.println("No tax!");
        }
    }
}
