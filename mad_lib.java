import java.util.Scanner;

public class mad_lib {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String adjective1;
        String noun;
        String adjective2;
        String verb1;
        String adjactive3;

        System.out.print("Enter an adjective (description): ");
        adjective1 = sc.nextLine();
        System.out.print("Enter a noun (animal or person): ");
        noun = sc.nextLine();
        System.out.print("Enter an adjective (description): ");
        adjective2 = sc.nextLine();
        System.out.print("Enter a verb end with -ing (action): ");
        verb1 = sc.nextLine();
        System.out.print("Enter an adjective (description): ");
        adjactive3 = sc.nextLine();

        System.out.println("Today I went to a "+adjective1+" a zoo.");
        System.out.println("In an exhibit I saw a "+noun+".");
        System.out.println(noun+ " was "+adjective2+" and "+ verb1 + "!");
        System.out.println("I was "+adjactive3+"!");

        sc.close();
    }
}
