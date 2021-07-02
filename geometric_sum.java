package Recursion;
public class geometric_sum {
	public static double findGeometricSum(int k){
		// Write your code here
        if(k==0)
		{
			return 1;
		}
	return 1+ 0.5*(findGeometricSum(k-1)); 

	}
}
