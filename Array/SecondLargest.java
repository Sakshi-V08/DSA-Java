public class SecondLargest {
    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE; // -infinity
        int sLargest=Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) { // O(n)
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
        }
        for(int i =0; i<numbers.length;i++){
            if(sLargest < numbers[i] && numbers[i] != largest){
                sLargest=numbers[i];
            }
        }
        System.out.println("Largest value is : " + sLargest);
        return largest;
    }

    public static void main(String args[]) {
        int numbers[] = { 1, 2, 4, 6, 8, 9 };
        getLargest(numbers);
    }
}
