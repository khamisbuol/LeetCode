import java.util.HashMap;

class RomanToInteger {

    public static void main(String[] args) {
        System.out.println(romanToIntLeetCode("III"));
        System.out.println(romanToIntLeetCode("LVIII"));
        System.out.println(romanToIntLeetCode("MCMXCIV"));

        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
    }

    /**
     * A funny yet effective solution to convert Roman Numerals to integers.
     * @param s Valid Roman Numeral string
     * @return integer representation of the Roman Numeral
     */
    public static int romanToIntLeetCode(String s) {
        int ans = 0; int num;

        s = s.replace("IV", "IIII").replace("IX", "VIIII");
        s = s.replace("XL", "XXXX").replace("XC", "LXXXX");
        s = s.replace("CD", "CCCC").replace("CM", "DCCCC");

        for (int i = 0; i < s.length(); i++ ) {
            switch (s.charAt(i)) {
                case 'I': num = 1; break;
                case 'V': num = 5; break;
                case 'X': num = 10; break;
                case 'L': num = 50; break;
                case 'C': num = 100; break;
                case 'D': num = 500; break;
                case 'M': num = 1000; break;
                default:
                    throw new IllegalStateException("Unexpected value: " + s.charAt(i));
            }
            ans += num;
        }
        return ans;
    }

    /**
     * This is my first implementation of the Roman Numerals to Integer problem on
     * Leet Code. It uses a hashmap for the mappings.
     *
     * @param s Valid Roman Numerals string
     * @return integer conversion of input Roman Numerals
     */
    public static int romanToInt(String s) {
        int ans = 0;
        HashMap<Character, Integer> romanIntsMap = new HashMap<>();
        romanIntsMap.put('I', 1);
        romanIntsMap.put('V', 5);
        romanIntsMap.put('X', 10);
        romanIntsMap.put('L', 50);
        romanIntsMap.put('C', 100);
        romanIntsMap.put('D', 500);
        romanIntsMap.put('M', 1000);
        int i = 0;
        while (i < s.length()) {
            // Retrieve char value from input string
            char currKey = s.charAt(i);
            char nextKey = i+1 == s.length() ? s.charAt(i) : s.charAt(i+1);

            // Get int values from map
            int currVal = romanIntsMap.get(currKey);
            int nextVal = romanIntsMap.get(nextKey);

            // Add current to total if equal to greater than next, iterate to next
            if (currVal >= nextVal) {
                ans += currVal;
                i++;
            }
            // Add difference between current value and next to total
            // Treat as a group and iterate to next value
            else {
                ans += nextVal - currVal;
                i += 2;
            }
        }
        return ans;
    }
}