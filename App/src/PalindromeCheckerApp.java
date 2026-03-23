public class PalindromeCheckerApp {

    static boolean method1(String str) {
        String rev = new StringBuilder(str).reverse().toString();
        return str.equals(rev);
    }

    static boolean method2(String str) {
        int i = 0, j = str.length() - 1;

        while(i < j) {
            if(str.charAt(i) != str.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "madam";

        long start1 = System.nanoTime();
        method1(str);
        long end1 = System.nanoTime();

        long start2 = System.nanoTime();
        method2(str);
        long end2 = System.nanoTime();

        System.out.println("Method1 Time: " + (end1 - start1));
        System.out.println("Method2 Time: " + (end2 - start2));
    }
}