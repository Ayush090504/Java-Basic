import java.util.Scanner;

public class pytha {
    public static void main(String[] args) {
       double a;
       double b;
       double c; 

       Scanner sc=new Scanner(System.in);

       System.out.print("The length of one side: ");
       a=sc.nextDouble();
       System.out.print("Enter the length of second side: ");
       b=sc.nextDouble();
       c=Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
       System.out.println("The lenght of the hypotenuse is: "+c);
       sc.close();
    }
}
