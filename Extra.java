import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Extra {
    
    private static final Map<Character, String> keypadMapping = new HashMap<>();

    static {
        keypadMapping.put('2', "abc");
        keypadMapping.put('3', "def");
        keypadMapping.put('4', "ghi");
        keypadMapping.put('5', "jkl");
        keypadMapping.put('6', "mno");
        keypadMapping.put('7', "pqrs");
        keypadMapping.put('8', "tuv");
        keypadMapping.put('9', "wxyz");
    }

    public static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.isEmpty()) {
            return result;
        }
        generateCombinations(digits, 0, new StringBuilder(), result);
        return result;
    }

    private static void generateCombinations(String digits, int index, StringBuilder current, List<String> result) {
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }
        char digit = digits.charAt(index);
        String letters = keypadMapping.get(digit);
        for (char letter : letters.toCharArray()) {
            current.append(letter);
            generateCombinations(digits, index + 1, current, result);
            current.deleteCharAt(current.length() - 1);
        }
    }

    public static void main(String[] args) {
        String digits = "23";
        List<String> combinations = letterCombinations(digits);
        System.out.println("Possible letter combinations for digits " + digits + ":");
        for (String combination : combinations) {
            System.out.println(combination);
        }
    }
}

