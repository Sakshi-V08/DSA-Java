import java.util.*;

public class Rathouse {
    public static int findHouse(int r, int unit, int n, int arr[]){
        int total = r * unit;
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += arr[i];  
            if(sum >= total){  
                return i + 1;  
            }
        }
        return -1;  
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();  
        int unit = sc.nextInt();  
        int n = sc.nextInt();  
        int arr[] = new int[n+1];  
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int result = findHouse(r, unit, n, arr);  
        System.out.println("No. of House :"+ result);  
    }
}
