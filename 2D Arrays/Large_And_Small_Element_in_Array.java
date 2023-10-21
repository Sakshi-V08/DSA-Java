import java.util.*;

public class Large_And_Small_Element_in_Array {
    // Two Array 
    public static void twoDArray(int matrix[][]) {
        
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                largest = Math.max(largest, matrix[i][j]);     //Largest
                smallest = Math.min(smallest, matrix[i][j]);   //Smallest
            }
        }
        System.out.println("Largest Element: "+largest);
        System.out.println("Smallest Element: "+smallest);
    }

    public static void main(String args[]) {
        int matrix[][] = new int[3][3];
        int n=matrix.length, m=matrix[0].length;

        //Taking input in matrix
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        //Output
         for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }
        twoDArray(matrix);

    }
   
}
