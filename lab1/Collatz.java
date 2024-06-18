/** Class that prints the Collatz sequence starting from a given number.
 *  @author Jacob Atanacio
 */
public class Collatz {

    /** nextNumber returns the next number in the Collatz sequence
     * the next number is determined as follows:
     *                      if n is even the next number will be n/2
     *                      if n is odd the next number will be 3n + 1
     *                      if n is 1 then the sequence is over**/
    public static int nextNumber(int n) {
        if (n  % 2 == 0) {
            return n/2;
        } else if (n == 1) {
            return 0;
        } else {
            return 3 * n + 1;
        }
    }
    /** Program should print 5 16 8 4 2 1 when n = 5 */
    public static void main(String[] args) {
        int n = 5;
        System.out.print(n + " ");
        while (n != 1) {
            n = nextNumber(n);
            System.out.print(n + " ");
        }
        System.out.println();
    }
}

