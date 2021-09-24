package exercise1;

public class Task9 {
    public static void main(String[] args) {
        int m[] = new int[] {15, 10, 51, 6, 5, 3, 10, -34, 0, 32, 56, 12, 24, 52};
        int n = m.length;
        int b;
        for (int i = 0; i < n/2; i++) {
            b = m[n - i - 1];
            m[n - i - 1] = a[i];
            m[i] = b;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}