/**
 * Problem number: 392
 * Link: https://leetcode.com/problems/is-subsequence/
 *
 * Author: Khamis Buol
 */

public class IsSubsequence {
    IsSubsequence(){}
    public static void main(String[] args) {

        IsSubsequence isSubsequence = new IsSubsequence();

        System.out.println(isSubsequence.isSubsequence("b", "a"));
        System.out.println(isSubsequence.isSubsequence("axc", "ahbgdc"));
    }

    /**
     * This is my solution to the is subsequence LeetCode problem.
     *
     * Given two strings s and t, return true if s is a subsequence of t,
     * or false otherwise.
     *
     * A subsequence of a string is a new string that is formed from the
     * original string by deleting some (can be none) of the characters
     * without disturbing the relative positions of the remaining characters.
     * (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
     *
     * @param s the string we will be checking if it is a subsequence of t.
     * @param t the string which we will check if s is a subsequence of.
     * @return true if s is subsequence of t otherwise false.
     */
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) return true;
        if (t.length() == 0) return false;
        int loc = 0;
        for (int i = 0; i < t.length(); i++) {
            if (loc < s.length() && t.charAt(i) == s.charAt(loc))
                loc++;
        }
        return loc == s.length();
    }
}
