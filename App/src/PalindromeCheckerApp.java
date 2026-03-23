interface PalindromeStrategy {
    boolean check(String str);
}

class ReverseStrategy implements PalindromeStrategy {
    public boolean check(String str) {
        String rev = new StringBuilder(str).reverse().toString();
        return str.equals(rev);
    }
}

class PalindromeContext {
    private PalindromeStrategy strategy;

    void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    boolean execute(String str) {
        return strategy.check(str);
    }
}

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        PalindromeContext context = new PalindromeContext();
        context.setStrategy(new ReverseStrategy());

        String str = "madam";

        if(context.execute(str)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}