import java.util.Scanner;

public class Lap35 {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        double a,b,c;
        System.out.println("enter three numbers");
        a=in.nextDouble();
        b=in.nextDouble();
        c=in.nextDouble();
        if (a==b&&b==c)
            System.out.println("all the same");
        else

            System.out.println("all different");
    }
}
