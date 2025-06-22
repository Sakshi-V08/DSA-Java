package QuestionPattern;
//In pascal's triangle, each number is the sum of the two numbers directly above it as shown
// tc O(n2) and sc O(n2)
public class PascalTriangle {
    public static void main(String args[]){
        int n = 5;
        printPascal(n);
    }
    public static void printPascal(int n){
        int[][] ans = new int[n][n];

        for(int i=0;i<n ;i++){
            for(int j= 0; j<=i;j++){
                if(j==0 || i==j){
                    ans[i][j] = 1;
                }
                else{
                    ans[i][j] = ans[i-1][j-1] + ans[i-1][j];
                }
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
