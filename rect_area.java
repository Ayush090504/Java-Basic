import java.util.Scanner;
public class rect_area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide the input only in integers!!");
        System.out.println("Enter the length of the rectangle: ");
        int length = sc.nextInt();
        System.out.println("Enter the width: ");
        int width = sc.nextInt();
        System.out.println("The area of the rectangle is: "+length*width);
        sc.close();
    }
}
