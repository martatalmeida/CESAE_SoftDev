package Ex02;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestStringUtils {


    @Test
    public void isPalindromeTest(){

        assertTrue(StringUtils.isPalindrome("arara"));
        assertTrue(StringUtils.isPalindrome("Arara"));
        assertTrue(StringUtils.isPalindrome("ararA"));
        assertTrue(StringUtils.isPalindrome("ARARA"));
        assertTrue(StringUtils.isPalindrome("21212"));
        assertFalse(StringUtils.isPalindrome("marta"));
        assertFalse(StringUtils.isPalindrome(null));

    }



}
