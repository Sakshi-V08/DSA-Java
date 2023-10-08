public class Largest_in_array {
    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE; // -infinity
        int smallest = Integer.MAX_VALUE; // +infinity
        
        for (int i = 0; i < numbers.length; i++) {  //O(n)
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }

        }
        System.out.println("Largest value is : " + largest);
        System.out.println("Smallest vlue is : " + smallest);
        return largest;
    }

    public static void main(String args[]) {
        int numbers[] = { 1, 2, 4, 6, 8, 9 };
         getLargest(numbers);
    }
}
