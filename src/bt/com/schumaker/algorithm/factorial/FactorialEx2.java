package bt.com.schumaker.algorithm.factorial;

/**
 *
 * @author hudsonschumaker
 */
public class FactorialEx2 {
    public static void main(String[] args) {
        int n = 5, i = 1;
        long f = 1;
        while(i <= n){
            f *= i++;
        }
        System.out.printf("Factorial of %d = %d\n",n, f);
    }
}