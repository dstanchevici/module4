package module4;

import java.util.*;

public class StackPalindrome_Question_B2 {

    public static void main (String[] argv)
    {

        String s = "A man, a plan, a canal: Panama";
        System.out.println (checkPalindromeSuffix ( s.toCharArray() ) );
        // Should print "amanaplanacanalpanama"

        String s2 = "News! A man, a plan, a canal: Panama";
        System.out.println (checkPalindromeSuffix ( s2.toCharArray() ) );
        // Should print "amanaplanacanalpanama"


        String s3 = "This is redder, Sis!";
        System.out.println (checkPalindromeSuffix ( s3.toCharArray() ) );
        // Should print "sisreddersis"

        String s4 = "But it is green, bro";
        System.out.println (checkPalindromeSuffix ( s4.toCharArray() ) );
        // Should print "No palindrome found"

    }

    static String checkPalindromeSuffix (char[] phrase)
    {
        // 1. Select from phrase letter chars and convert caps to lower-case
        String letters = "";
        int diffLowerCap = 'a' - 'A';
        for (char c: phrase) {
            for (char ltr = 'a'; ltr <='z'; ltr++) {
                if ( (c== ltr) || (c==ltr- diffLowerCap) ) {
                    letters += (ltr);
                    break;
                }
            }
        }

        // 2. Find palindrome suffix's start boundary
        //     Such a suffix should be at least two characters long.
        int palSufStart = -1;
        for (int leftInd=0; leftInd<letters.length()-1; leftInd++) {
            if ( isPalindrome (letters.substring(leftInd)) ) {
                palSufStart = leftInd;
                break;
            }
        }

        if (palSufStart >= 0) {
            return letters.substring(palSufStart);
        }

        return "Not a palindrome";
    }

    static boolean isPalindrome (String suffix)
    {
        Stack<Character> ltrStack = new Stack<>();
        int mid = suffix.length() / 2;
        for (int i=0; i<mid; i++) {
            ltrStack.push( suffix.charAt(i) );
        }

        if ( suffix.length() % 2 != 0) mid += 1;
        for (int i=mid; i<suffix.length(); i++) {
            char c = ltrStack.pop();
            if ( c != suffix.charAt(i) )
                return false;
        }
        return true;
    }

}
