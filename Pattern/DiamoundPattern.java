import java.util.Scanner;
public class DiamoundPattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int spaces=n-1, star=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=spaces;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=star;j++)
            {
                System.out.print("*");
            }
            spaces--;
            star+=2;
            System.out.println();
        }
        spaces=0;
        star=2*n-1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=spaces;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=star;j++)
            {
                System.out.print("*");
            }
            spaces++;
            star-=2;
            System.out.println();
        }

    }
}
