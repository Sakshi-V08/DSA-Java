public class Subarray_min_max {
    public static void subArray(int numbers[]) {

        int[] sumArray = new int[numbers.length * (numbers.length + 1) / 2]; // Create an array to store sum values
        int currentIndex = 0; // Index to track the current position in the sumArray

        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                int sum = 0; // Initialize sum for each subarray

                System.out.print("[");
                for (int k = start; k <= end; k++) {
                    System.out.print(" " + numbers[k] + " ");
                    sum = sum + numbers[k];
                }
                System.out.println("]");

                // Store the sum in the sumArray and increment the currentIndex
                sumArray[currentIndex] = sum;
                currentIndex++;

                System.out.println();
            }
            System.out.println();
        }

        // Print the sumArray
        System.out.print("Sum Array: [");
        for (int i = 0; i < sumArray.length; i++) {
            System.out.print(sumArray[i]);
            if (i < sumArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        getLargest(sumArray);  // Find largest and smallest value from sumArray
    }
    
    //find the largest and smallest value 
    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE; // -infinity
        int smallest = Integer.MAX_VALUE; // +infinity

        for (int i = 0; i < numbers.length; i++) {    // O(n)
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
        int numbers[] = { 2, 4, 6, 8, 10 };
        subArray(numbers);
    }
}
