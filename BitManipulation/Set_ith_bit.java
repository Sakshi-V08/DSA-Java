public class Set_ith_bit {
    public static int setItBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    public static void main(String args[]) {
        int n = 10;
        int i = 3;
        System.out.print(setItBit(n, i));
    }
}

