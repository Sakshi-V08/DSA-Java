package Segment_Trees;
// Construction of segment trees O(n)  but in query - O(logn) udpate - O(logn)
public class CreationST {
    static int tree[];

    public static void init(int n) {
        tree = new int[4 * n];

    }
// stri = segment tree idx
    public static int buildST(int arr[], int sti, int start, int end) {
        //base cases
        if (start == end) {
            tree[sti] = arr[start];
            return arr[start]; //then goes on rightbst after completing first round storing 1 in the tree
        }
        int mid = (start + end) / 2;
        buildST(arr, 2 * sti + 1, start, mid); // leftsubtree - 2*i+1
        buildST(arr, 2 * sti + 2, mid + 1, end); // right subarray - 2*i+2

        tree[sti] = tree[2 * sti + 1] + tree[2 * sti + 2];
        return tree[sti];
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int n = arr.length;
        init(n);
        buildST(arr, 0, 0, n - 1);

        for (int i = 0; i < tree.length; i++) {
            System.out.print(tree[i] + " ");
        }
    }
}
