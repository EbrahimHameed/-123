import java.util.Scanner;

public class Lap29 {
    public static void main(String[] args) {
        int a,b;
        Scanner in=new Scanner(System.in);
        System.out.println("enter two numbers");
        a=in.nextInt();
        b=in.nextInt();
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println((a+b)/2);
        System.out.println(Math.abs(a-b));
        System.out.println(Math.max(a,b));
        System.out.println(Math.min(a,b));
    }
}
