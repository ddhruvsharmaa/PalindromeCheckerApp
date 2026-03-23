import java.util.*;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String str = "madam";

        Deque<Character> dq = new LinkedList<>();

        for(char c : str.toCharArray()) {
            dq.add(c);
        }

        boolean isPalindrome = true;

        while(dq.size() > 1) {
            if(dq.removeFirst() != dq.removeLast()) {
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}