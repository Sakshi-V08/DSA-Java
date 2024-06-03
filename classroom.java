import java.util.*;

public class classroom {
    public static void main(String args[]) {
        Integer num1 = 500;
        Integer num2 = 500;
        if (num1 == num2) {
            System.out.println("num1==num2");
        } else {
            System.out.println("above condition wrong");
        }
    }

}
// if(num1.equals(num2)){
// System.out.println("num1==num2");
// } now it print if condition because it compare it value but in the above case
// it compare with their reference value(memory location) not it value
