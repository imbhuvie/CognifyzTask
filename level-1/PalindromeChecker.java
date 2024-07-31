import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String or Phrase :");
        String str = sc.nextLine();
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        if (palindromeChecker.isPalindrome(str))
            System.out.println(str + ", is Palindrome.");
        else
            System.out.println(str + ", is not Palindrome.");
    }

    public boolean isPalindrome(String str) {
        int sizeOfStr = str.length();
        int i = 0;
        int j = sizeOfStr - 1;
        while (i < sizeOfStr) {
            while (isChar(str.charAt(i)) != 't') {
                i++;
            }
            while (isChar(str.charAt(j)) != 't') {
                j--;
            }
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;

        }
        return true;
    }

    public char isChar(char ch) {
        if (ch >= 97 && ch <= 122 || ch >= 65 && ch <= 90) {
            return 't';
        }
        return 'f';
    }

}
