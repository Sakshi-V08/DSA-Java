public class Trapped_Water {
    public static int trappedRainwater(int height[]) {  //O(n)

        int n = height.length;
        // calculate left max boundary : array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }
        // calculate right max boundary : array
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        // loop
        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            // waterLevel = min(leftmax bound, rightmax bpund)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            // trapped water = waterLevel -height
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;

    }

    public static void main(String args[]) {
        int height[] = {1,8,6,2,5,4,8,3,7};
        System.out.println("Total volume of water is trapped : "+ trappedRainwater(height));
    }

}
