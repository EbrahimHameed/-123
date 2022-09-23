import java.util.Scanner;

public class Lap33 {
    public static void main(String[] args) {
        int a;
        Scanner in=new Scanner(System.in);
        System.out.println("enter anynumber");
        a=in.nextInt();
        if (a>0)
            System.out.println("positive");
       else if (a<0)
            System.out.println("negative");
       else
            System.out.println("zero");
    }
}
