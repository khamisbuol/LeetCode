import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {

    IsomorphicStrings(){}

    public static void main(String[] args) {
        IsomorphicStrings isomorphicStrings = new IsomorphicStrings();
        System.out.println(isomorphicStrings.isIsomorphic("badc", "baba"));
        System.out.println("---------------------------");
        System.out.println(isomorphicStrings.isIsomorphic("egg", "add"));

    }

    /**
     *
     * @param s first string to morph from
     * @param t second string to morph into
     * @return true if String t is an isomorph of String s.
     */
    public boolean isIsomorphic(String s, String t) {
        System.out.println("s: "+s);
        System.out.println("t: "+t);
        if (s.length() != t.length()) return false;

        Map<Character, Character> sMapping = new HashMap<>();
        Map<Character, Character> tMapping = new HashMap<>();

        // Iteratively add to maps
        for (int i = 0; i < s.length(); i++) {
            // if key is not already part of mappings - add otherwise ignore
            if (!sMapping.containsKey(s.charAt(i))) {
                sMapping.put(s.charAt(i), t.charAt(i));
            }

            if (!tMapping.containsKey(t.charAt(i))) {
                tMapping.put(t.charAt(i), s.charAt(i));
            }

        }

        if (sMapping.size() != tMapping.size()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            char sCurr = s.charAt(i);
            char tCurr = t.charAt(i);
            char sKey = sMapping.get(sCurr);
            char tKey = tMapping.get(tCurr);
            if (sCurr != tKey) return false;
            if (tCurr != sKey) return false;
        }
        return true;
    }
}
