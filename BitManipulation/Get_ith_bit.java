public class Get_ith_bit {
    public static int getithbit(int n,int i) {
        int bitMask = 1<<i;
        if ((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void main(String args[]) {
        int n = 10;
        int i=3;
        System.out.print(getithbit(n,i));
    }
    
}
