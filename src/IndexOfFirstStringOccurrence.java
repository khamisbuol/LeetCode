public class IndexOfFirstStringOccurrence {

    public static void main(String[] args) {
        String haystack = "mississippi";
        String needle = "issip";

        System.out.println(strStr(haystack, needle));
    }

    // haystack = "sadbutsad", needle = "sad" --> 0
    // haystack = "leetcode", needle = "leeto" --> -1
    public static int strStr(String haystack, String needle) {
        int result = -1;
        if (needle.length() > haystack.length()) {
            return result;
        }
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                result = i;
                for (int j = 0; j < needle.length(); j++) {
                    if (haystack.charAt(i+j) != needle.charAt(j)) {
                        result = -1;

                    }
                }
                return result;
            }
        }
        return result;
    }
}
