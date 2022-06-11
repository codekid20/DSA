package Stack_and_Queue.questions;

import java.util.Stack;

//https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/
public class removeDuplicates {
    public static void main(String[] args) {
        String s = "abbaca";
        System.out.println(removeDuplicates(s));
    }

    public static String removeDuplicates(String s) {
        StringBuilder str = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (char c: s.toCharArray()) {
            if( !stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        for (char ch : stack) str.append(ch);

        return str.toString();
    }
}
