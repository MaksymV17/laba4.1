package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class PalindromeCheckerTest {

    @Test
    public void testIsPalindromeWithValidPalindrome() {
        assertTrue(PalindromeChecker.isPalindrome("eye"));
        assertTrue(PalindromeChecker.isPalindrome("racecar"));
    }

    @Test
    public void testIsPalindromeWithNonPalindrome() {
        assertFalse(PalindromeChecker.isPalindrome("hello"));
        assertFalse(PalindromeChecker.isPalindrome("world"));
        assertFalse(PalindromeChecker.isPalindrome("notapalindrome"));
    }

    @Test
    public void testIsPalindromeWithEmptyString() {
        assertTrue(PalindromeChecker.isPalindrome(""));
    }

    @Test
    public void testIsPalindromeWithNullInput() {
        assertFalse(PalindromeChecker.isPalindrome(null));
    }
}