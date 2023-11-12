package hw_18_10_2023;



public class findSingleElement {
    public static int findSingleElement(int[] arr) {
        int n = arr.length;
        int i = 0;

        while (i < n) {
            if (i == n - 1 || arr[i] != arr[i + 1]) {
                return arr[i];
            }

            i += 2;
        }

        return -1;
    }
}