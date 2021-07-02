package Recursion;
public class number_of_digits {

	public static int count(int n){
		if(n == 0)
			return 0;
        
        int smallAns = count(n / 10);
        n--;
        return smallAns+1;
	}

}