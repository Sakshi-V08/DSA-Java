import java.util.*;

public class Solutions {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if ((n % 4) != 0) {
            System.out.println("Not a Leap Year");
        } else if ((n % 100) != 0) {
            System.out.println("Leap Year");
        } else if ((n % 400) != 0) {
            System.out.println("Not a Leap Year");
        } else {
            System.out.println("Leap Year");
        }

    }

}
