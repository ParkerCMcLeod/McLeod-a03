package baseline;

import java.util.Scanner;

public class PaymentCalculator {

    public static int calculateMonthsUntilPaidOff() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your balance? ");
        double balance = scanner.nextDouble();
        balance = Math.ceil(balance * 100) / 100;
        System.out.print("What is the APR on the card (as a percent)? ");
        double APR = scanner.nextDouble();
        APR = APR / 100 / 365;
        System.out.print("What is the monthly payment you can make? ");
        double payment = scanner.nextDouble();
        double n =  -(1/30.0) * Math.log(1 + balance/payment * (1 - Math.pow(1 + APR,30))) / Math.log(1 + APR);
        n = Math.ceil(n);
        return (int) n;
    }
}
