package bt.com.schumaker.algorithm.letter;

/**
 *
 * @author hudsonschumaker
 */
public class Alphabet {
    public static void main(String[] args) {
        char c = '*';
        if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
            System.out.println(c + " is an alphabet.");
        else
            System.out.println(c + " is not an alphabet.");
    }
}