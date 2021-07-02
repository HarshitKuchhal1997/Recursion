package Recursion;
public class sum_of_array {
	public static int sum(int input[]) {		
        int sum=0;
        for(int i=0;i<input.length;i++){
            sum+=input[i];
        }
        return sum;
    }
}

