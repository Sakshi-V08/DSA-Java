// One or more than one times appear

public class Array_1 {
    public static void twiceAppear(int numbers[]) {
        int count = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    count++;
                }
            }
        }
        if (count == 0) {
            System.out.println("False");
        } else {
            System.out.println("True");
        }

    }

    public static void main(String agrs[]) {
        int numbers[] = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        twiceAppear(numbers);
    }

}
