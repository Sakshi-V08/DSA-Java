// Trapped water
public class Array_4 {
    public static int trappedWater(int height[]) {
        int n = height.length;

        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        // calculate left maximum height using auxiliary array
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);

        }
        // calculate right maximum height using auxiliary array
        int rightMax[]=new int[n];
        rightMax[n-1]=height[n-1];
        for(int i= n-2;i>=0;i--){
            rightMax[i]=Math.max(height[i],rightMax[i+1]);
        }
        // loop
        int trappedWater=0;
        for(int i=0;i<n;i++){
            int waterLevel=Math.min(leftMax[i],rightMax[i]);
            //trappedWater = waterlevel - height
            trappedWater += waterLevel- height[i];
        }
        return trappedWater;

    }

    public static void main(String args[]) {
        int height1[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        System.out.println("Total volume of water trapped: " + trappedWater(height1));
        int height2[] = { 4, 2, 0, 3, 2, 5 };
        System.out.println("Total volume of water trapped: " + trappedWater(height2));
    }

}
