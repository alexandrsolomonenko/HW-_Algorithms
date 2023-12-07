package hw_08_11_2023;

public class CalculatingSum {
    public static void main(String[] args) {

    }
    public static int sum(int n, int m) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % m == 0) {
                sum += i;
            }
        }
        return sum;
    }
    public static int sumRecursive(int n, int m, int current) {
        if (current > n) {
            return 0;
        } else if (current % m == 0) {
            return current + sumRecursive(n, m, current + 1);
        } else {
            return sumRecursive(n, m, current + 1);
        }
    }
}
