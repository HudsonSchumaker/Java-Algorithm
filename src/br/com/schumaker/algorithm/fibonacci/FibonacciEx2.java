package br.com.schumaker.algorithm.fibonacci;

/**
 *
 * @author hudson schumaker
 */
public class FibonacciEx2 {
    public static void main(String[] args) {
        int n = 20, t1 = 0, t2 = 1;
        System.out.println("First " + n + " terms: ");
        for (int i = 1; i <= n; ++i) {
            System.out.println(t1 + " , ");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
}
