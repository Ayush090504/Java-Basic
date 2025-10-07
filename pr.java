public class pr {
    public static void main(String[] args) {
        String name="Spongbob";
        char firstletter='S';
        int age=40;
        double height=60.4;
        boolean isEmployeed=true;

        System.out.printf("Hello %s\n",name);
        System.out.printf("Your name starts with a %c\n",firstletter);
        System.out.printf("Your age is: %d\n",age);
        System.out.printf("Your height is: %.1f\n",height); //To specify the number of digits that should be visible after the decimal we use precision. At the place were we display the specifier (%f) we mention the number of digits we want after the decimal .1 in this case.
        System.out.printf("Your are Employeed? %b",isEmployeed);
    }
}
