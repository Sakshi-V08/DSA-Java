public class Updateithbit {

    public static int setItBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    public static int clearItBit(int n, int i) {
        int bitMask = 1 << i;
        return n & ~(bitMask);
    }

    public static int updateithbit(int n, int i, int newBit) {
        // if (newBit == 0) {
        //     return clearItBit(n, i);
        // } else {
        //     return setItBit(n, i);
        // }
        n=clearItBit(n,i);
        int BitMask=newBit<<i;
        return n|BitMask;
    }

    public static void main(String args[]) {
        int n = 10;
        int i = 2;
        int newBit=1;
        System.out.print(updateithbit(n, i,newBit));
    }

}
