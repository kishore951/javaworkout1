import java.util.Scanner;

public class LargestNumber0neLine {
    public static void main(String[] args){
        int a,b,c;
        Scanner s=new Scanner((System.in));
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        System.out.println((a>b)?((a>c)?a:c):((b>c)?b:c));

    }
}
