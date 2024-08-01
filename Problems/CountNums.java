package Problems;

public class CountNums {
    public static void main(String[] args) {

        // check that how many 5's are there in the given number
        int n = 45535;

        int count = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem == 5) {
                count++;
            }
            n /= 10;  // n = n / 10;
        }

        System.out.println(count);
    }
}