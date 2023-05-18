public class AddDigits {
    public static void main(String[] args) {
        System.out.println(addDigits(38));
        System.out.println(addDigits(9991));
    }

    public static int addDigits(int num) {
        if (num < 10) return num;
        else return addDigits(addDigits(num % 10) + addDigits(num / 10));
    }
}
