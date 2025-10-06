import java.util.Random;
public class random {
    public static void main(String[] args){
        Random random=new Random();

        int num;
        double num2;

        num2=random.nextDouble(0,1);
        num=random.nextInt(1,7); //The second number in the newInt method tells the limit till what number we want to get. That number itself is not included in it.
        System.out.println(num);
        System.out.println(num2);

        boolean isheads;

        isheads=random.nextBoolean();

        if(isheads){
            System.out.println("It is heads");
        }
        else{
            System.out.println("Its tails");
        }
    }
}
