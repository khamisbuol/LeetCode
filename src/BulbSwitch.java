import java.util.Arrays;

public class BulbSwitch {

    public static void main(String[] args) {
        System.out.println(bulbSwitch(0));
        System.out.println(bulbSwitch(1));
        System.out.println(bulbSwitch(2));
        System.out.println(bulbSwitch(3));
        System.out.println(bulbSwitch(4));
        System.out.println(bulbSwitch(100));
    }

    /**
     * n = 0 --> 0
     * n = 1 --> 1
     *   i=0 --> [0]
     *   i=1 --> [1]
     *
     * n = 2 --> 1
     *   i=0 --> [0,0]
     *   i=1 --> [1,1]
     *   i=2 --> [1,0]
     *
     * n = 3 --> 1
     *   j=0 --> [0,0,0]
     *   j=1 --> [1,1,1]
     *   j=2 --> [1,0,1]
     *   j=3 --> [1,0,0]
     *
     * n = 4 --> 2
     *   i=0 --> [0,0,0,0]
     *   i=1 --> [1,1,1,1]
     *   i=2 --> [1,0,1,0]
     *   i=3 --> [1,0,0,0]
     *   i=4 --> [1,0,0,1]
     *
     * n = 5 --> 2
     *   i=0 --> [0,0,0,0,0]
     *   i=1 --> [1,1,1,1,1]
     *   i=2 --> [1,0,1,0,1]
     *   i=3 --> [1,0,0,0,1]
     *   i=4 --> [1,0,0,1,1]
     *   i=5 --> [1,0,0,1,0]
     *
     * n = 6 --> 2
     *   i=0 --> [0,0,0,0,0,0]
     *   i=1 --> [1,1,1,1,1,1]
     *   i=2 --> [1,0,1,0,1,0]
     *   i=3 --> [1,0,0,0,1,1]
     *   i=4 --> [1,0,0,1,1,1]
     *   i=5 --> [1,0,0,1,0,1]
     *   i=6 --> [1,0,0,1,0,0]
     *
     * n = 7 --> 4
     *   i=0 --> [0,0,0,0,0,0,0]
     *   i=1 --> [1,1,1,1,1,1,1]
     *   i=2 --> [1,0,1,0,1,0,1]
     *   i=3 --> [1,0,1,1,1,0,0]
     *   i=4 --> [1,0,1,0,1,0,0]
     *   i=5 --> [1,0,1,0,0,0,0]
     *   i=6 --> [1,0,1,0,0,1,0]
     *   i=7 --> [1,0,1,0,0,1,1]
     *
     * @param n number of bulbs to toggle
     * @return number of bulbs that are on after n rounds
     */
    public static int bulbSwitch(int n) {
        int[] bulbs = new int[n];
        for (int i = 0; i <= n; i++) {
            if (i == 0 || i == 1) {
                Arrays.fill(bulbs, i);
                if (i == n) return i;
            } else {
                for (int j = i-1; j < bulbs.length; j+=i) {
                    bulbs[j] = bulbs[j] == 0 ? 1 : 0;
                }
            }
        }
        System.out.print("n="+n+" ");
        return Arrays.stream(bulbs).sum();
    }

    public static int optimisedBulbSwitch(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {

        }

        return 0;
    }
}
