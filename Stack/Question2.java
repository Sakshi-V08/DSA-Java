package Stack;
import java.util.*;
public class Question2 {
    //Reverse a String using a Stack
    public static String reverseString(String str){
        Stack<Character> s = new Stack<>();
        int idx=0;
        while(idx < str.length()){
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder result = new StringBuilder("");
        while(!s.isEmpty()){
            char curr= s.pop();
            result.append(curr);
        }

        str= result.toString();   //because stringbuilder have different type from string
        return str;
    }
    public static void main(String args[]){
        String str="HelloWorld";
        String result=reverseString(str);
        System.out.println("Reverse the string: "+result );
        System.out.println("String Type: "+result.getClass().getSimpleName());
}
}