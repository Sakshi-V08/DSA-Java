import java.util.HashSet;
import java.util.Set;

public class trail {

    public static String removeCharacters(String A, String B) {
        // Convert string B to a set of characters
        Set<Character> charSetB = new HashSet<>();
        for (char c : B.toCharArray()) {
            charSetB.add(c);
        }

        // StringBuilder to store the leftover characters from A
        StringBuilder leftover = new StringBuilder();

        // Iterate through string A and add characters that are not in set B
        for (char c : A.toCharArray()) {
            if (!charSetB.contains(c)) {
                leftover.append(c);
            }
        }

        return leftover.toString();
    }

    public static void main(String[] args) {
        String A = "hello";
        String B = "world";

        String result = removeCharacters(A, B);
        System.out.println("Leftover string: " + result);
    }
}
