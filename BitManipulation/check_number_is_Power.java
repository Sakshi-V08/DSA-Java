public class check_number_is_Power {
    public static boolean checkPower(int n){
        return (n&(n-1))==0;
    } 
    public static void main(String args[]){
        int n=7;
        System.out.print("The number is a power of 2 : "+ checkPower(n));
    }

    
}
