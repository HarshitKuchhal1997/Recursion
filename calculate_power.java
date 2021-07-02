package Recursion;
public class calculate_power {

	public static int power(int n, int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */
		if(x==0)
            return 1;
        else
        	return n * (power(n, x-1));
	}
}