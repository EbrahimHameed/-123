import java.util.Scanner;

public class Lap37 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner in=new Scanner(System.in);
        System.out.println("enter three numbers");
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        if (a<b&&b<=c)
            System.out.println("in order");
        else if (a>b&&b>=c)
            System.out.println("in order");
        else
            System.out.println("not in order");
    }
}
