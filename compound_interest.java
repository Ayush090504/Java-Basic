import java.util.Scanner;
public class compound_interest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.print("Enter the principal amount: ");
        principal=sc.nextDouble();

        System.out.print("Enter the interest rate (%form): ");
        rate=sc.nextDouble()/100;

        System.out.print("Enter the number of times coumpounded per year: ");
        timesCompounded=sc.nextInt();

        System.out.print("Enter the number of years: ");
        years=sc.nextInt();

        amount=principal*Math.pow(1+rate/timesCompounded, timesCompounded*years);

        System.out.println("The amount after "+years+" is: $"+amount);

        sc.close();
    }
}
