public class Reverse_Array {
    public static void reverseArray(int numbers[]) {
        int first = 0, last = numbers.length - 1;
        int[] reverse= new int[numbers.length];
        int j=0;

        // while (first < last) {
        //     // swap
        //     int temp = numbers[last];
        //     numbers[last] = numbers[first];
        //     numbers[first] = temp;
        //     first++;
        //     last--;
        // }
        for(int i=last;i>=first;i--){
            reverse[j] = numbers[i] ;
            j++;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(reverse[i] + " ");
        }

    }

    public static void main(String args[]) {
        int numbers[] = { 2, 4, 5, 6, 8, 9, 10 };

        reverseArray(numbers);
       
        System.out.println();
    }

}
