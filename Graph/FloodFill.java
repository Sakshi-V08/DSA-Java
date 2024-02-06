package Graph;
import java.util.*;

public class FloodFill {

    // O(m*n)
    public void helper(int[][] image, int sr, int sc, int color, boolean vis[][], int orgCol) {
        if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || vis[sr][sc] || image[sr][sc] != orgCol) {
            return;
        }

        // Mark the current pixel as visited
        vis[sr][sc] = true;

        // Change the color of the current pixel
        image[sr][sc] = color;

        // Move to the left, right, up, and down neighbors
        helper(image, sr, sc - 1, color, vis, orgCol); // left
        helper(image, sr, sc + 1, color, vis, orgCol); // right
        helper(image, sr - 1, sc, color, vis, orgCol); // up
        helper(image, sr + 1, sc, color, vis, orgCol); // down
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        boolean vis[][] = new boolean[image.length][image[0].length];
        helper(image, sr, sc, color, vis, image[sr][sc]);
        return image;
    }

    public static void main(String args[]) {
        int[][] image = { { 1, 1, 1 }, { 1, 1, 0 }, { 1, 0, 1 } };
        FloodFill floodFillObj = new FloodFill();
        
        // Specify the starting pixel (sr, sc) and the new color
        int sr = 1;
        int sc = 1;
        int newColor = 2;

        floodFillObj.floodFill(image, sr, sc, newColor);

        // Print the updated image
        for (int[] row : image) {
            System.out.println(Arrays.toString(row));
        }
    }
}

