public class Monotonic {
    public static boolean isIncreasing(int[] arr,int n){
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
        public static boolean isDecreasing(int[] arr,int n){
        for(int i=0;i<n-1;i++){
            if(arr[i]<arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static boolean isMonotonic(int[] arr,int n){
        boolean isIncreasing=isIncreasing(arr, n);
        boolean isDecreasing=isDecreasing(arr, n);
        return isIncreasing || isDecreasing;

    }
    public static void main(String[] args){
        int[] arr={2,3,4,5};
        int n=arr.length;
        if(isMonotonic(arr, n)==true){
             System.out.println("An array is monotonic.");
        }
        else{
             System.out.println("An array is not monotonic.");

        }
        

    }
    
}
