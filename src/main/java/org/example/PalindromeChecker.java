package org.example;

public class PalindromeChecker {
    public static boolean isPalindrome(String word) {
        if (word == null) {
            return false;
        }

        word = word.replaceAll("\\s", "").toLowerCase();

        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        String testWord = "eye";
        boolean isPalindromic = isPalindrome(testWord);
        System.out.println("Is the word a palindrome? " + isPalindromic);
    }
}