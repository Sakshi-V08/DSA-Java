public class Bit_Even_Odd {
    public static void bitManipulation(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            System.out.print("The number is even.");
        } else {
            System.out.print("The number is odd.");
        }
    }

    public static void main(String args[]) {
        int n = 6;
        bitManipulation(n);
    }

}
