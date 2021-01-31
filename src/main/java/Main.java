public class Main {
    public static void main(String[] args) {
        System.out.println(numberPow(12,4));
    }

    public static int numberPow(int number, int n) {
        if (n <= 1) {
            return number;
        }
        return number * numberPow(number, --n);
    }
}
