import java.util.Scanner;

public class Lap22 {
    public static void main(String[] args) {
        double circle,width,high;
        Scanner in=new Scanner(System.in);
        System.out.println("enter the width and height");
        width=in.nextDouble();
        high=in.nextDouble();
        circle=width*high;
        System.out.println("area of circle ="+circle);

    }
}
