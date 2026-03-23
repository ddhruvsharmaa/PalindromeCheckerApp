import java.util.LinkedList;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String str = "madam";
        LinkedList<Character> list = new LinkedList<>();

        for(char c : str.toCharArray()) {
            list.add(c);
        }

        boolean isPalindrome = true;

        while(list.size() > 1) {
            if(list.removeFirst() != list.removeLast()) {
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