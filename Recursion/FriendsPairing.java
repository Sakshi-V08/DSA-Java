package Recursion;
public class FriendsPairing {
    public static int friendsPairing(int n) {
        // base cases
        if (n == 1 || n == 2) {
            return n;
        }
        // choice
        //1. single
        // int fnm1 = friendsPairing(n - 1);
        //2. pair
        // int fnm2 = friendsPairing(n - 2);

        // int pairWays = (n-1) * fnm2;

        // total number of pairing
        // int totPair = fnm1 + pairWays;
        // return totPair;
        return friendsPairing(n-1) + friendsPairing(n-2) *(n-1);
    }
    public static void main(String args[]) {
        System.out.println(friendsPairing(4));
        

    }

}
